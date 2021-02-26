package funcoes;

import java.util.Scanner;

public class TestaLaco {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num, maior = 0;
		
		System.out.println("Digite um número:");
		num = ler.nextInt(); 
		
		while(num >= 0) {
			if(num > maior) {
				maior = num;
			} 
			System.out.println("Digite mais um número:");
			num = ler.nextInt();
		}
		System.out.printf("O maior número digitado foi %d",maior);
			
		
			
			


	}

}
