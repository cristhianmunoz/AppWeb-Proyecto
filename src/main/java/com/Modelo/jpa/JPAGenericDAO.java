package com.Modelo.jpa;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.Modelo.dao.GenericDAO;

public class JPAGenericDAO<T,ID> implements GenericDAO<T, ID> {
	protected EntityManager em;
	private Class<T> persistenceClass;
	public JPAGenericDAO(Class <T> persistentClass) {
		this.persistenceClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("proyectoAppWeb").createEntityManager();

	}
	@Override
	public List<T> get() {
		return null;
	}

	@Override
	public T getById(ID id) {
		return em.find(persistenceClass, id);
	}

	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error" + e);
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
		
		
	}

	@Override
	public void update(T entity){
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("Error" + e);
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
	}

	@Override
	public void deleteById(ID idPersona){
		T entity = this.getById(idPersona);
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
		
	}
}
