package com.educacionit.digitalers.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.educacionit.digitalers.entidades.Usuario;

@Controller // @RestController --> Por si queremos que tengan un body y no quiero colocar ResponseBody en cada metodo
public class PrimerControlador {
	@Autowired // Instancia cuando lo necesite
	Usuario usuario1;

	@RequestMapping(value = {"/"},method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println(usuario1);
		model.addAttribute("saludo","Octavio Robleto");
		return "home";
	}
	
	@RequestMapping(value="/hola.html",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody()
	public String hola() {
		return "hola mundo";
	}
}
