package estruturaRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		System.out.print("Digite sua idade:");
		idade = ler.nextInt();
		
		while(idade >= 1) {      // teste com a estrutura de repeti��o while
			System.out.printf("Sua idade � %d",idade);
			if(idade >= 18) {
				System.out.printf("\nVoc� � de maior..");
			} 
			else {
				System.out.printf("\nVoc� � de menor..");
			}
			System.out.print("\nDigite sua idade:");
			idade = ler.nextInt();
		} 
		System.out.println("Programa finalizado");

	}

}
