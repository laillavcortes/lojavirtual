package com.lojavirtual.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lojavirtual.domain.Produto;
import com.lojavirtual.services.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Produto> getById(@PathVariable Integer id) {
		return service.find(id);
	}
	
	@RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<Produto> insert(@Valid @RequestBody Produto produto) {
        produto = service.insert(produto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Produto> list(){
		return service.findAll();
	} 

}
