package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Pedido;

/*
* <Pedido, Objeto que será retornado à camada services
* Integer> Tipo do identificador aplicado na classe Pedido.java
*/
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	//JpaRepository consegue realizar todas as operações de CRUD com apenas essa interface
}
