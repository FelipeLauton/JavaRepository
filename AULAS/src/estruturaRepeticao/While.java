package estruturaRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		System.out.print("Digite sua idade:");
		idade = ler.nextInt();
		
		while(idade >= 1) {      // teste com a estrutura de repetição while
			System.out.printf("Sua idade é %d",idade);
			if(idade >= 18) {
				System.out.printf("\nVocê é de maior..");
			} 
			else {
				System.out.printf("\nVocê é de menor..");
			}
			System.out.print("\nDigite sua idade:");
			idade = ler.nextInt();
		} 
		System.out.println("Programa finalizado");

	}

}
