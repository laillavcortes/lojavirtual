package com.lojavirtual;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lojavirtual.domain.Categoria;
import com.lojavirtual.domain.Produto;
import com.lojavirtual.repositories.CategoriaRepository;
import com.lojavirtual.repositories.ProdutoRepository;

@SpringBootApplication
public class LojavirtualApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(LojavirtualApplication.class, args);
		System.out.println("BANCO RODANDO");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Camiseta");
		Categoria cat2 = new Categoria(null,"Calca");
		
		Produto p1 = new Produto (null, "Gola Pollo", 99.90);
		Produto p2 = new Produto (null, "Regata", 19.90);
		Produto p3 = new Produto (null, "Cos Alto", 59.90);
		
		cat1.getProdutos().addAll(Arrays.asList(p1));
		cat1.getProdutos().addAll(Arrays.asList(p2));
		cat2.getProdutos().addAll(Arrays.asList(p3));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat2));
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}	

}
