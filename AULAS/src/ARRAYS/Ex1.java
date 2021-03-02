package ARRAYS;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/*Faça um programa que leia 5 números com um vetor de 
		 pontuação de atividade e escreva em seguida os números e
		 depois escreva o maior número.
		*/
		
		Scanner ler = new Scanner(System.in);
		int valores[] = new int[5];
		int maiorPontuacao = 0;
		
		for(int y=0; y<valores.length; y++) {
			System.out.printf("Digite o valor %d: ",(y+1));
			valores[y]= ler.nextInt();
		}
		for(int y=0; y<valores.length; y++) {
			System.out.println("O valor "+ (y+1)+ " é "+ valores[y]);
			if(valores[y]> maiorPontuacao) {
				maiorPontuacao = valores[y];
			}
		}
		
		System.out.printf("A maior pontuação é %d",maiorPontuacao);

	}

}
