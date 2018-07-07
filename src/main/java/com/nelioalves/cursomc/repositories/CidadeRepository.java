package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Cidade;

/*
* <Cidade, Objeto que será retornado à camada services
* Integer> Tipo do identificador aplicado na classe Cidade.java
*/
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	//JpaRepository consegue realizar todas as operações de CRUD com apenas essa interface
}
