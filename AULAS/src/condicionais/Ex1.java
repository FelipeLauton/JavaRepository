package condicionais;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner ler = new Scanner(System.in);
		int numeroUm, numeroDois, numeroTres, maior;
		
		System.out.println("Escreva o primeiro número:");
		numeroUm = ler.nextInt();
		System.out.println("Escreva o segundo número:");
		numeroDois = ler.nextInt();
		System.out.println("Escreva o terceiro número:");
		numeroTres = ler.nextInt();
		
		if (numeroUm > numeroDois && numeroUm > numeroTres){ 	
			maior = numeroUm;
		}	
		else if (numeroDois > numeroTres) {			               
			maior = numeroDois;
		}	
		else {
			maior = numeroTres;
		}	
		
		System.out.printf("O maior número é %d",maior);
        
	}

}
