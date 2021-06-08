package revisando;

import java.util.Scanner;

public class PrimeiraAula {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.print("Entre com sua idade:\n");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.print("Entre com seu nome:\n");
		nome = ler.next();
		System.out.printf("Seu nome: %s\n",nome);
		System.out.printf("Sua idade: %d\n",idade);
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade!");
		}
		
		
		
		
		
	}

}
