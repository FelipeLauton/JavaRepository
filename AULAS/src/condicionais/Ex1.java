package condicionais;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner ler = new Scanner(System.in);
		int numeroUm, numeroDois, numeroTres, maior;
		
		System.out.println("Escreva o primeiro n�mero:");
		numeroUm = ler.nextInt();
		System.out.println("Escreva o segundo n�mero:");
		numeroDois = ler.nextInt();
		System.out.println("Escreva o terceiro n�mero:");
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
		
		System.out.printf("O maior n�mero � %d",maior);
        
	}

}
