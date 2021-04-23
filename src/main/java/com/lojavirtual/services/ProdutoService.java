package com.lojavirtual.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.domain.Produto;
import com.lojavirtual.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	
	@Autowired
	private ProdutoRepository repository;
	
	public Optional<Produto> find(Integer id) {
		Optional<Produto> produto = repository.findById(id);
		return produto;
	}
	
	@Transactional
    public Produto insert(Produto produto) {
        produto.setId(null);
        produto = repository.save(produto);
        return produto;
    }
	
	public List<Produto> findAll(){
		return repository.findAll();
	}

}
