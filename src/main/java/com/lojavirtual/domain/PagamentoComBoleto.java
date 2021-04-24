package com.lojavirtual.domain;

import java.util.Date;

public class PagamentoComBoleto {
	
	private Date dataVencimento;
	private Integer dataPagamento;
	
	
	public PagamentoComBoleto() {
		super();
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	public Integer getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(Integer dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	
	
	

}
