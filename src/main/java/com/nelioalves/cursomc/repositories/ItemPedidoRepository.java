package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.ItemPedido;

/*
* <ItemPedido, Objeto que será retornado à camada services
* Integer> Tipo do identificador aplicado na classe ItemPedido.java
*/
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{
	//JpaRepository consegue realizar todas as operações de CRUD com apenas essa interface
}
