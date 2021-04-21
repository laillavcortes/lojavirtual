package com.lojavirtual.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lojavirtual.domain.Categoria;
import com.lojavirtual.services.CategoriaService;

@RestController
@RequestMapping (value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public Optional<Categoria> getById(@PathVariable Integer id) {
		return service.find(id);
	}

	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<Categoria> insert(Categoria categoria) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(categoria.getId()).toUri();
        return ResponseEntity.created(uri).build();
	
	}
	
	public List<Categoria> list(){
		return service.findAll();
		
	} 
	
}
