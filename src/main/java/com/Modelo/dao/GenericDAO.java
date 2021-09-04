package com.Modelo.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T, ID> {
	public List<T> get();
	public T getById(ID id);
	public void create(T entity);
	public void update(T entity) throws SQLException;
	public void deleteById(ID idPersona) throws SQLException;

}
