package com.lojavirtual.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PAGAMENTO COM CARTAO")
public class PagamentoComCartao implements Serializable{


	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {
		super();
	}
	
	

	public PagamentoComCartao(Integer numeroDeParcelas) {
		super();
		this.numeroDeParcelas = numeroDeParcelas;
	}



	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
}
