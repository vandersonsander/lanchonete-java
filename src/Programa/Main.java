package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Para começar, digite o seu nome: ");
		String nome = scan.next();
		
		limparTela();
		System.out.println("Seja Bem Vindo, " + nome);
		menuPrincipal();
	}
	
	public static void menuPrincipal() {
		int opt = 0;
		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("\n[1] Sanduiche [2] Massa [3] Bolo");
			opt = scan.nextInt();
			if (opt < 1 || opt > 3) System.out.println("\nOpção Inválida, tente novamente");
			limparTela();
		} while(opt < 1 || opt > 3);
		switch (opt) {
		case 1:
			menuSanduiche();
			break;
		case 2:
			menuMassa();
			break;
		case 3:
			menuBolo();
			break;
		}
	}
	
	public static void menuSanduiche() {
		int ing = 1;
		String ingrediente;
		List<String> ingredientes = new ArrayList<>();
		
		do {
			System.out.println("Escolha um ingrediente para o seu lanche:");
			System.out.println("Para sair pressione \"s\"");
			ingrediente = scan.next() + scan.nextLine();
			limparTela();
			if (ingrediente.equals("s")) break;
			ingredientes.add(ingrediente);
			ing++;
		} while (ing < 11);
		
		Sanduiche sanduiche = new Sanduiche(ingredientes, 5.0);
		
		limparTela();
		System.out.println("\nVocê selecionou os seguintes ingredientes");
		sanduiche.mostrarIngredientes();
		
		System.out.println("\nDigite a distância (km): ");
		double distancia = scan.nextDouble();
		
		limparTela();
		sanduiche.entregar(distancia);
	}
	
	public static void menuMassa() {
		int opt = 0;
		String molho;
		
		do {
			System.out.println("Selecione o massa:"
				+ "\n[1] Pizza [2] Macarrao [3] Lasanha");
			opt = scan.nextInt();
			if (opt < 1 || opt > 3) System.out.println("\nOpção Inválida, tente novamente");
			limparTela();
		} while(opt < 1 || opt > 3);
		
		limparTela();
		System.out.println("Selecione o molho:");
		molho = scan.next() + scan.nextLine();
		
		limparTela();
		System.out.println("\nDigite a distância (km): ");
		double distancia = scan.nextDouble();
		
		switch (opt) {
		case 1:
			Pizza pizza = new Pizza(molho, 20);
			limparTela();
			pizza.entregar(distancia);
			break;
			
		case 2:
			Macarrao macarrao = new Macarrao(molho, 25);
			limparTela();
			macarrao.entregar(distancia);
			break;
			
		case 3:
			Lasanha lasanha = new Lasanha(molho, 30);
			limparTela();
			lasanha.entregar(distancia);
			break;
		}
	}
	
	public static void menuBolo() {
		limparTela();
		System.out.println("Escolha a Massa");
		String massaBolo = scan.next() + scan.nextLine();
		
		limparTela();
		System.out.println("Escolha o Recheio");
		String recheio = scan.next() + scan.nextLine();
		
		limparTela();
		System.out.println("Escolha a Cobertura");
		String cobertura = scan.next() + scan.nextLine();
		
		Bolo bolo = new Bolo(massaBolo, recheio, cobertura, 40);
		
		limparTela();
		System.out.println("\nDigite a distancia (km)");
		double distancia = scan.nextDouble();
		
		limparTela();
		bolo.entregar(distancia);
	}
	
	public static void limparTela() {
		for (int i = 0; i < 51; i++) System.out.println();
	}
	
} 
