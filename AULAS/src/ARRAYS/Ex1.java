package ARRAYS;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/*Fa�a um programa que leia 5 n�meros com um vetor de 
		 pontua��o de atividade e escreva em seguida os n�meros e
		 depois escreva o maior n�mero.
		*/
		
		Scanner ler = new Scanner(System.in);
		int valores[] = new int[5];
		int maiorPontuacao = 0;
		
		for(int y=0; y<valores.length; y++) {
			System.out.printf("Digite o valor %d: ",(y+1));
			valores[y]= ler.nextInt();
		}
		for(int y=0; y<valores.length; y++) {
			System.out.println("O valor "+ (y+1)+ " � "+ valores[y]);
			if(valores[y]> maiorPontuacao) {
				maiorPontuacao = valores[y];
			}
		}
		
		System.out.printf("A maior pontua��o � %d",maiorPontuacao);

	}

}
