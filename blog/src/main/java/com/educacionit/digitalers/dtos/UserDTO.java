package com.educacionit.digitalers.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	@Email(message = "Email Debe ser un tipo Correo Electronico")
	@NotEmpty(message = "Debe enviar correo[email]")
	private String email;
	@NotEmpty(message = "Debe enviar clave[key]")
	private String key;
	@NotNull(message = "Debe enviar activo[active]")
	private Boolean active;
	private String message;
}

// El DTO lo necesitamos porque para la autenticacion no necesitamos que el objeto que me vayan a mandar
// sea un user o sea yo no necesito que el objeto que me envien para autenticar a alguien sea el id, el correo
// la clave, el activo o cualquiera de estos elementos de User.java, yo solo necesito el mail y key y yo
// voy a responder de alguna u otra forma.