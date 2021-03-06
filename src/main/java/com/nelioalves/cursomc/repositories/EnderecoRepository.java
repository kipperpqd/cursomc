package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Endereco;

/*
* <Cliente, Objeto que será retornado à camada services
* Integer> Tipo do identificador aplicado na classe Cliente.java
*/
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	//JpaRepository consegue realizar todas as operações de CRUD com apenas essa interface
}
