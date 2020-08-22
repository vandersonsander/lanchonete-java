package Programa;

public abstract class Massa extends Lanche {
	final int tempoDePreparo = 30;
	private String molho;
	
	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getMolho() {
		return molho;
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
}
