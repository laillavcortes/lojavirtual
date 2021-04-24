package com.lojavirtual.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Pagamento com Boleto")
public class PagamentoComBoleto {
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		super();
	}

	public PagamentoComBoleto(Date dataVencimento, Date dataPagamento) {
		super();
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	

	
	
}
