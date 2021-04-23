package com.lojavirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.domain.Produto;

public interface ProdutoRepository extends JpaRepository <Produto,Integer> {

}
