package com.algaworks.id;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//criando a classe RELATORIOSERVLET, essa classe vai ser um SERVLET
//
//usando a ANNOTATION @WEBSERVLET para dizer para o TOMCAT q ela e um SERVLET
@WebServlet("/relatorio")
public class RelatorioServlet extends HttpServlet {


	//criando uma var/depedencia/atributo de RELATORIOSERVICE
	//e agora com ANNOTATION @INJECT estamos INVERTENDO O CONTROLE utilizando o CDI para fazer a INJECAO DE DEPEDENCIA
	//estamos dizendo assim q RELATORIOSERVICE q e uma DEPEDENCIA de RELATORIOSERVLET tera uma INSTANCIA INJETADA
	//pelo CDI
	@Inject
	private RelatorioService relatorioService;
	
	
	
	//sobreescrever o metodo DOGET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println(relatorioService.totalPedidosMesAtual());
	}
	
	
	
}
