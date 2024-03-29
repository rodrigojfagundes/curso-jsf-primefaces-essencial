package com.algaworks.erp.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.erp.model.Empresa;
import com.algaworks.erp.model.RamoAtividade;
import com.algaworks.erp.model.TipoEmpresa;

public class CamadaPersistencia {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlgaWorksPU");
		
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		RamoAtividades ramoAtividades = new RamoAtividades(em);
		Empresas empresas = new Empresas(em);
		
		List<RamoAtividade> listaDeRamoAtividades = ramoAtividades.pesquisar("");
		List<Empresa> listaDeEmpresas = empresas.pesquisar("");
		System.out.println(listaDeEmpresas);
		
		Empresa empresa = new Empresa();
		empresa.setNomeFantasia("Joao da Silva");
		empresa.setCnpj("41.952.519/0001-57");
		empresa.setRazaoSocial("Joao da Silva41952519000157");
		empresa.setTipo(TipoEmpresa.MEI);
		empresa.setDataFundacao(new Date());
		empresa.setRamoAtividade(listaDeRamoAtividades.get(0));
		
		empresas.guardar(empresa);
	
		em.getTransaction().commit();
		
		List<Empresa> listaDeEmpresas2 = empresas.pesquisar("");
		System.out.print(listaDeEmpresas2);
		
		
		em.close();
		emf.close();
	}
	
	
}
