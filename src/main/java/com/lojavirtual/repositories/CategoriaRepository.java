package com.lojavirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.domain.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria,Integer> {

}
