package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Estado;

/*
* <Estado, Objeto que será retornado à camada services
* Integer> Tipo do identificador aplicado na classe Estado.java
*/
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	//JpaRepository consegue realizar todas as operações de CRUD com apenas essa interface
}
