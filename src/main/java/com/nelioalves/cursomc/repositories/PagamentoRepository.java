package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Pagamento;

/*
* <Pagamento, Objeto que será retornado à camada services
* Integer> Tipo do identificador aplicado na classe Pagamento.java
*/
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{
	//JpaRepository consegue realizar todas as operações de CRUD com apenas essa interface
}
