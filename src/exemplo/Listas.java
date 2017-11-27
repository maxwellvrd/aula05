package exemplo;

import java.util.List;
import java.util.ArrayList;
import entidade.Produto;



public class Listas {
	public static void main(String[]args) {
		
		// Primeiro contato com Collections
		
		/* Declaraçao do objeto */
		
		Produto pro1 = new Produto();
		Produto pro2 = new Produto();
		Produto pro3 = new Produto();
		
		/* Declarando uma lista */
		
		List<Produto> listaDeCompras = new ArrayList<Produto>();
		
		/* Atribuindo valores aos objetos de ListaDeCompras*/
		pro1.setId(10L);
		pro1.setNmProduto("Arroz");
		pro1.setPreco(10.5);
		pro1.setQuantidade(5.);
		
		pro2.setId(20L);
		pro2.setNmProduto("Feijão");
		pro2.setPreco(7.8);
		pro2.setQuantidade(2.5);
		
		pro3.setId(30L);
		pro3.setNmProduto("Açucar");
		pro3.setPreco(30.);
		pro3.setQuantidade(1.);
		
		/* Atribuindo a lista */
		
		listaDeCompras.add(pro1);
		listaDeCompras.add(pro2);
		listaDeCompras.add(pro3);
		
		/*Saída da lista*/
		
		for(Produto produto : listaDeCompras) {
			System.out.println(produto);
		}
	}

}
