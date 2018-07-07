package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private Integer cod;
	private String descricao;
		
	// construtor do tipo ENUM é PRIVATE
	private TipoCliente(Integer cod, String descricao) {
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
	public static TipoCliente toEnum (Integer cod) {
		if (cod == null) {
			return null;
		}
		
		// se o "cod" for 1 retorna PESSOAFISICA, 2 retorna PESSOAJURIDICA
		for (TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido: " + cod);
	}
	
	
}
