package com.algaworks.id;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.persistence.EntityManager;



//criando a classe/entidades pedidos
//
public class Pedidos {
	
	//CODIGO A BAIXO NAO E NESCESSARIO AS 2 LINHAS A BAIXO
	//@Inject
	//private EntityManager manager;
	
	
	//criando um metodo q retorna a SOMA dos valores de todos os PEDIDOS do MES ATUAL
	//
	public BigDecimal totalPedidosMesAtual() {
		return new BigDecimal("100");
	}
	
	
	
}
