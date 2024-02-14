package com.algaworks.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.erp.model.Empresa;
import com.algaworks.erp.repository.Empresas;
import com.algaworks.erp.util.Transactional;


public class CadastroEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Empresas empresas;
	
	
	@Transactional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}
	
	
	@Transactional
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}
	
	
	
}
