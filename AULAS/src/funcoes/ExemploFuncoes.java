package funcoes;

import java.util.Scanner;

public class ExemploFuncoes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tamanho;
		
		System.out.println("Digite um n�mero:");
		tamanho = input.nextInt();
		parImpar(tamanho);
		
		System.out.println("-------------------");

	}
	
	public static void pula() {
		System.out.println("VOU PULAR A LINHA");
		System.out.println();
		System.out.println("PULEI");
	}
	
	public static void parImpar(int numero) {
		
		if(numero %2 == 0) {
			System.out.printf("O n�mero %d � par!!",numero);
			pula();
		} 
		else {
			System.out.printf("O n�mero %d � impar!");
			pula();
		}
	}

}
