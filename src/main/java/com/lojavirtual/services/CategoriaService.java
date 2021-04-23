package com.lojavirtual.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.domain.Categoria;
import com.lojavirtual.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	
	@Autowired
	private CategoriaRepository repository;
	
	public Optional<Categoria> find(Integer id) {
		Optional<Categoria> categoria = repository.findById(id);
		return categoria;
	}
	
	@Transactional
    public Categoria insert(Categoria categoria) {
        categoria.setId(null);
        categoria = repository.save(categoria);
        return categoria;
    }
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}

}
