package Programa;

import java.util.List;

public class Sanduiche extends Lanche {
	final int tempoDePreparo = 15;
	private List<String> ingredientes;
	
	public Sanduiche(List<String> ingredientes, double preco) {
		this.ingredientes = ingredientes;
		super.setPreco(preco);
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public void entregar(double km) {
		double tempoTotalDeEntrega = km * 10 + tempoDePreparo;
		System.out.println(
				"O total do seu pedido é R$"
				+ super.getPreco()
				+ "\nO tempo de entrega é de " 
				+ tempoTotalDeEntrega 
				+ " minutos"
			);
	}
	
	public void mostrarIngredientes() {
		ingredientes.forEach((ingrediente) -> {
			System.out.println(ingrediente);
			super.setPreco(super.getPreco() + 2);
		});
	}
}
