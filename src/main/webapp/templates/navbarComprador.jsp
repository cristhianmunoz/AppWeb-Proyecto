<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<nav class="text-white navbar navbar-expand-lg navbar-dark bg-success text-white">
	<div class="container-fluid">
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<a class="navbar-brand">Sistema de subastas</a>
			<ul class="navbar-nav mb-2 mb-lg-0 ">
				<li id="tabCompras" class="nav-item"><a
					class="nav-link text-center px-4 text-white" href="MostrarSubastaControlador"
					role="button" >
						Listar subastas </a></li>
				<li id="tabEgresos" class="nav-item"><a
					class="nav-link text-center px-4 text-white" href="CrearSubastaControlador"
					role="button" >
						Crear subasta </a></li>

			</ul>	
		</div>
		<div class="d-flex flex-row-reverse  bd-highlight">
				
				<ul class="navbar-nav mx-auto">
					<li class="nav-item dropdown"><a
						class="nav-link text-white dropdown-toggle my-auto me-3 text-center" href="#"
						id="navbarDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> <i class="bi bi-person-circle color"></i>
							<span id="Usuario">${sessionScope.usuarioLogeado.getNombreComprador()}</span>
					</a>
						<ul
							class="dropdown-menu dropdown-menu-end dropdown-menu-dark  bg-success "
							aria-labelledby="navbarDropdown">
							<li><a id="cerrarsesion"
								class="dropdown-item text-center text-white nav-link" href="LogoutControlador">Cerrar
									sesión</a></li>
						</ul></li>
				</ul>
			</div>
	</div>
</nav>