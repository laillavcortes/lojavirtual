package com.lojavirtual.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.domain.Cliente;
import com.lojavirtual.repositories.ClienteRepository;
import com.lojavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository repository;
	
	public Cliente find(Integer id) {
		Optional<Cliente> cliente = repository.findById(id);
		return cliente.orElseThrow(()-> new ObjectNotFoundException("Cliente nao encontrada! Id: " + id + ", tipo: " + Cliente.class.getName()));
	}
	
	@Transactional
    public Cliente insert(Cliente cliente) {
        cliente.setId(null);
        cliente = repository.save(cliente);
        return cliente;
    }
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}

}
