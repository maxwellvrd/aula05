package util;

import entidade.Compra;
import entidade.Produto;
import entidade.Empregada;
import java.util.List;

public class DestruidorDeObjetos {

	// Retirar a referencia do objeto
	
	public static void setNull(List<Compra> compras) {
		for(Compra compra: compras) {
			for(Produto produto : compra.getListaDeProdutos()) {
				produto.setId(null);
				produto.setNmProduto(null);
				produto.setPreco(null);
				produto.setQuantidade(null);
				produto = null;
			}
			
			compra.setId(null);
			compra.setEmpregada(null);
			compra.setListaDeProdutos(null);
			compra = null;
		}
		
		// Chama o lixeiro
		
		if(lixeiro())
			System.err.println("Objetos destruídos");
	}
	
	// Sugere a JVM que execute o Garbage Collector (lixeiro)
	
	private static boolean lixeiro() {
		System.gc();
		return Boolean.TRUE;
	}
}
