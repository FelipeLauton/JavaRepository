package EXEMPLOS;

import java.util.Scanner;

import revisao.Pessoa;

public class TesteRevisao {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in); // objeto - leia 
		String nome;
		int anoNascimento;
		char genero;
		
		System.out.println("Digite o nome do amigo: ");
		nome =leia.next();
		Pessoa amigo2 = new Pessoa(nome);
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.println("Digite M - masculino, F - feminino: ");
		genero = leia.next().toUpperCase().charAt(0);
		
		Pessoa cliente = new  Pessoa(nome, anoNascimento,genero); // instanciar = criar
		
		//teste
		Pessoa amigo = new Pessoa("Van"); //OBJETO - amigo  
		Pessoa cliente1 = new Pessoa("Maria"); // OBJETO - cliente
		
		System.out.println("O nome da amizade é:"+ cliente.getNome());
		

	}

}
