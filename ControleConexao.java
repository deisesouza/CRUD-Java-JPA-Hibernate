package br.com.deise.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ControleConexao {

	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("crudJavaPU");
	
	public EntityManager conectar() {
		return fabrica.createEntityManager();
		
	}
	
}