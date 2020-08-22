package Programa;

public abstract class Lanche {
	private double preco;
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public abstract void entregar(double km);

}
