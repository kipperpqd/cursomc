package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired 
	/* @Autowired instancia automaticamente a dependencia repo 
	* pelo mecanismo de injeção de dependencias ou inversao de controle*/
	private CategoriaRepository repo;
	
	public Categoria buscar (Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
