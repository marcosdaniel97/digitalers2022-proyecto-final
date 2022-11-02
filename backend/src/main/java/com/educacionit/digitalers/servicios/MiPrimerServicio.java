package com.educacionit.digitalers.servicios;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import com.educacionit.digitalers.configuraciones.ConfiguracionRest;

@Path(value = "/MiPrimerServicio")
public class MiPrimerServicio {
	
	
	
	// que verbo http va a escuchar este metodo
	@GET
	@Path(value = "/saludo1")
	public String saludo1() {
		return "Hola mundo";
	}
	
	@GET
	@Path(value = "/saludo2")
	public Response saludo2() {
		return Response.status(203).entity("Hola mundo").build();
	}
	@GET
	@Path(value = "/saludo3")
	@Produces(value = MediaType.TEXT_HTML)
	public Response saludo3() {
		return Response.ok().entity("<h1>Hola mundo</h1>").build();
	}
}
