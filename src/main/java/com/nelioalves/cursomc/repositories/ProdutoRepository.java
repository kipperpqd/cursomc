package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Produto;

/*
* <Produto, Objeto que será retornado à camada services
* Integer> Tipo do identificador aplicado na classe Produto.java
*/
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	//JpaRepository consegue realizar todas as operações de CRUD com apenas essa interface
}
