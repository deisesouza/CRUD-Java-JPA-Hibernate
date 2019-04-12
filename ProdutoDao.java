package br.com.deise.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import br.com.deise.controller.ControleConexao;
import javax.persistence.Query;
import br.com.deise.model.Produto;

public class ProdutoDao {

	Produto produto = new Produto();

	//INSERT
	public void salvar(Produto produto) {
		EntityManager gerenciador = new ControleConexao().conectar();
		try {
			gerenciador.getTransaction().begin();
			gerenciador.persist(produto);
			gerenciador.getTransaction().commit();
		}catch (Exception e){
			gerenciador.getTransaction().rollback();
		}finally{
			gerenciador.close();
		}
	}
	
	//UPDATE
	public void alterar(Produto produto) {
		EntityManager gerenciador = new ControleConexao().conectar();
		try {
			gerenciador.getTransaction().begin();
			gerenciador.merge(produto);
			gerenciador.getTransaction().commit();		
		}catch(Exception e){
			gerenciador.getTransaction().rollback();
		}finally {
			gerenciador.close();
		}	
	}
	
	//DELETE
	public Produto remover(Integer id) {
		EntityManager gerenciador = new ControleConexao().conectar();
		try {
			produto = gerenciador.find(Produto.class, id);
			gerenciador.getTransaction().begin();
			gerenciador.remove(produto);
			gerenciador.getTransaction().commit();
		}catch(Exception e){
			gerenciador.getTransaction().rollback();
		}finally {
			gerenciador.close();
		}
		return produto;
	}

	// SELECT(POR ID)
	public Produto buscarPorId(Integer id){
		EntityManager gerenciador = new ControleConexao().conectar();
		try{
			produto = gerenciador.find(Produto.class, id);
		}catch(Exception e) {
			System.err.println(e);
		} finally {
			gerenciador.close();
		}
		return produto;
	}			

	// SELECT
	public List<Produto> listarTodos(){
		EntityManager gerenciador = new ControleConexao().conectar();
		List<Produto> lista = null;
		try {
			lista = (List<Produto>)gerenciador.createQuery("from Produto c").getResultList();
		}catch(Exception e) {
			System.err.println(e);

		} finally {
			gerenciador.close();
		}
		return lista;	

	}	

	
}
