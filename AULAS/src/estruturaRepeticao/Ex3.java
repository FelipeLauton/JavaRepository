package estruturaRepeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		//5- Crie um programa que leia um n�mero do teclado at� que encontre um
		//n�mero igual a zero. No final, mostre a soma dos n�meros
		//digitados.(DO...WHILE)
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		System.out.print("Digite um n�mero:");
		num = input.nextInt();
		
		do {
			soma = soma + num;
			
			System.out.print("Digite outro n�mero:");
			num = input.nextInt();
		}while(num != 0);
		
		System.out.printf("O resultado da soma � %d",soma);

	}

}
