package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.entity.Cliente;
import com.cibertec.service.ClienteService;

@Controller
public class ClienteController {

	
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping("/verInicio")
	public String ver() {
		return "index";
	}
	
	@RequestMapping("/registra")
	public String registra(Cliente obj) {
		service.insertaCliente(obj);
		return "index";
	}
}
