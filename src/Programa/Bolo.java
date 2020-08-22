package Programa;

public class Bolo extends Lanche {
	public final int tempoDePreparo = 10;
	private String massa;
	private String recheio;
	private String cobertura;
	
	public Bolo(String massa, String recheio, String cobertura, double preco) {
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
		super.setPreco(preco);
	}
	
	// Getters and Setters
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	public void entregar(double km) {
		double tempoTotalDeEntrega = km * 10 + tempoDePreparo;
		System.out.println(
				"O total do seu pedido é R$"
				+ super.getPreco()
				+ "\nO tempo de entrega é " 
				+ tempoTotalDeEntrega 
				+ " minutos"
			);
	}
}
