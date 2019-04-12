package br.com.deise.principal;

import java.math.BigDecimal;
import java.util.List;
import br.com.deise.model.Produto;
import br.com.deise.model.dao.ProdutoDao;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		ProdutoDao executar = new ProdutoDao();
		
		//produto.setNome("Carlos");
		//produto.setData("04/11/2010");
		//produto.setValor(new BigDecimal(3700));
		
		//SALVAR
		//executar.salvar(produto);
		
		//ALTERAR
		//executar.alterar(produto);
		
		//DELETAR
		executar.remover(5); 
		
		//LISTAR POR ID
		//produto = executar.buscarPorId(2);
		//System.out.println("Nome: " + produto.getNome() + " Valor: " + produto.getValor() +  " Data: " + produto.getData());
		
		//LISTAR TODOS
		//List<Produto> produtos = executar.listarTodos();
		//for(Produto p: produtos) {
		//	System.out.println("Nome: " + p.getNome() + " Valor: " +p.getValor() + " Data: " +p.getData());
		//}
		
	}

}
