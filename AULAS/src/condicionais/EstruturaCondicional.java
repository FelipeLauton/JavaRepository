package condicionais;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero = 0;

		System.out.println("Escreva um n�mero: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par!");
		} else {
			System.out.println("O n�mero " + numero + " � impar");
			//System.out.printf("O n�mero %d � impar", numero); - profissional
			// %d - n�mero inteiro 
			// %f - double - %.2f
		}
	}

}
