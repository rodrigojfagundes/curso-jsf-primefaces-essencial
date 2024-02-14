package com.algaworks.id;

public class Main {

	public static void main(String[] args) {
		
		//criando UMA propiedade/var/atributo do tipo PEDIDOS e UMA do tipo RELATORIOSERVICE
		Pedidos pedidos = new Pedidos();
		
		
		//A BAIXO E A FORMA 1 DE FAZER INJECAO DE DEPEDENCIAS
		//
		//agora dessa forma nos ESTAMOS INJETANDO DEPEDENCIAS, ou seja ESTAMOS INJETANDO UMA INSTANCIA de 
		//PEDIDOS dentro de uma outra ENTIDADE(RELATORIOSERVICE)
			//RelatorioService relatorioService = new RelatorioService(pedidos);
		
		//A BAIXO FORMA 2 DE FAZER INJECAO DE DEPEDENCIAS
		//fazendo a INJECAO pelo o metodo SETTER q ta na classe RELATORIOSERVICE
		//ou seja estamos chamando o metodo SETPEDIDOS q esta na classe RELATORIOSERVICE
		//e passando para esse metodo uma DEPEDENCIA/OBJ q foi instanciada na classe MAIN.JAVA q é o PEDIDOS
		//ou seja estamos INJETANDO UMA DEPEDENCIA
		RelatorioService relatorioService = new RelatorioService();
		//relatorioService.setPedidos(pedidos);
		
		
		
	}
	
	
	
	
	
}
