package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;

/*
* <Categoria, Objeto que será retornado à camada services
* Integer> Tipo do identificador aplicado na classe Categoria.java
*/
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	//JpaRepository consegue realizar todas as operações de CRUD com apenas essa interface
}
