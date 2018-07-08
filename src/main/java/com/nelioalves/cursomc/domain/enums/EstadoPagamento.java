package com.nelioalves.cursomc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private Integer cod;
	private String descricao;
		
	// construtor do tipo ENUM é PRIVATE
	private EstadoPagamento(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	// Somente Getters
	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	
	// STATIC permite execução sem instanciar o objeto
	public static EstadoPagamento toEnum (Integer cod) {
		if (cod == null) {
			return null;
		}
		
		// se o "cod" for 1 retorna PENDENTE, 2 retorna QUITADO, 3 CANCELADO
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido: " + cod);
	}
}
