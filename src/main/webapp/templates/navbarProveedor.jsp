<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<nav class="navbar navbar-expand-lg navbar-dark bg-success text-white">
	<div class="container-fluid">
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<a class="navbar-brand">Sistema de Tutorias EPN</a>
		</div>
		<div class="d-flex flex-row-reverse  bd-highlight">
				
				<ul class="navbar-nav mx-auto">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle my-auto me-3 text-center" href="#"
						id="navbarDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> <i class="bi bi-person-circle color"></i>
							<!--  --><span class="text-white" id="Usuario">${sessionScope.usuarioLogeado.getNombre()}</span>
					</a>
						<ul
							class="dropdown-menu dropdown-menu-end dropdown-menu-dark  bg-success "
							aria-labelledby="navbarDropdown">
							<li><a id="cerrarsesion"
								class="dropdown-item text-white text-center nav-link" href="LogoutControlador">Cerrar
									sesión</a></li>
						</ul></li>
				</ul>
			</div>
	</div>
</nav>