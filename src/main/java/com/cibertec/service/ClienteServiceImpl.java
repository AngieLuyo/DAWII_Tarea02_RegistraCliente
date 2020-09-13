package com.cibertec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Cliente;
import com.cibertec.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public void insertaCliente(Cliente obj) {
	repository.save(obj);
		
	}

}
