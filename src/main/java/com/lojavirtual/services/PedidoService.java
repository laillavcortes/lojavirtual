package com.lojavirtual.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.domain.Pedido;
import com.lojavirtual.repositories.PedidoRepository;
import com.lojavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	public Pedido find(Integer id) {
		Optional<Pedido> pedido = repository.findById(id);
		return pedido.orElseThrow(()-> new ObjectNotFoundException("Pedido nao encontrada! Id: " + id + ", tipo: " + Pedido.class.getName()));
	}
	
	@Transactional
    public Pedido insert(Pedido pedido) {
        pedido.setId(null);
        pedido = repository.save(pedido);
        return pedido;
    }
	
	public List<Pedido> findAll(){
		return repository.findAll();
	}
	
}
