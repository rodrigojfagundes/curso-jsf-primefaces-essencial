package com.algaworks.id;

import java.math.BigDecimal;

import javax.inject.Inject;

//uma classe de relatorio, q basicament devolveria os dados para a geracao de um relatorio
//
public class RelatorioService {
	
//EXPLICACAO DO PROFESSOR SOBRE INJECAO DE DEPEDENCIAS...
	//Do jeito q estamos vendo a baixo a CLASSE/ENTIDADE PEDIDOS é uma DEPEDENCIA da nossa CLASSE/ENTIDADE
	//RELATORIOSERVICE, embora NAO TENHA NENHUMA ANOTACAO(TIPO @INJECT)
	
	//criando uma var/obj do tipo PEDIDOS de nome PEDIDOS
	//
	//colocando ANNOTATION @INJECT para dizer q a VAR/ATRIBUTOS PEDIDO sera INJETADA por uma instancia
	//q vai ser criada pelo CDI
	@Inject
	private Pedidos pedidos;
	
	
	//OBS DESSE JEITO AQUI NAAAAOOOO E INJECAO DE DEPEDENCIAS: PRIVATE Pedidos pedidos =  new Pedidos();
	//nao é pois PELO O Q O PROFESSOR DISSE UMA INJECAO DE DEPEDENCIAS VEM DE FORA da CLASSE/ENTIDADE RELATORIOSERVICE...
	//e ali esta sendo instanciado dentro da propia classe com o "= NEW PEDIDOS();"
	
	
	
	
	
	//criando o CONSTRUTOR DE RELATORIOSERVICE q recebe um atributo/var de nome PEDIDOS do tipo PEDIDOS
	//
	public RelatorioService(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	
	
	//criando UM METODO CONSTRUTOR VAZIO
	public RelatorioService() {
		
	}
	
	
	//criando um metodo para mostrar os pedidos do mes atual
	//esse metodo de nome TOTALPEDIDOSMESATUAL vai chamar o METODO TOTALPEDIDOSMESATUAL q esta na classe PEDIDOS
	//
	public BigDecimal totalPedidosMesAtual() {
		return pedidos.totalPedidosMesAtual();
	}

	

	//criando um metodo do tipo SETPEDIDO q serve para ALTERARMOS o valor q ta na var/atributos PEDIDOS
	//e vamos usar como UMA MANEIRA 2 DE FAZER INJECAO DE DEPEDENCIAS
	//
	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	
	
	
	
	
	
}
