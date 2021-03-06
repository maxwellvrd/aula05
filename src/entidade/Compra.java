package entidade;

import java.util.List;

public class Compra {

	private Long id;
	private Empregada empregada;
	private List<Produto> listaDeProdutos;
	
	public Compra() {
		
	}
	
	@Override
	
	public String toString() {
		return "\tCompra: \n\n\tID: " + id + "\n\n\tEmpregada: " + empregada + "\n\tLista de produtos:\n" + listaDeProdutos;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Empregada getEmpregada() {
		return empregada;
	}
	
	public void setEmpregada(Empregada empregada) {
		this.empregada = empregada;
	}
	
	public List<Produto> getListaDeProdutos(){
		return listaDeProdutos;
	}
	
	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
}
