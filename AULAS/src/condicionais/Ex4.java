package condicionais;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		//4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//�mpar exiba o n�mero elevado ao quadrado.
		
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		double raiz, quadrado;
		
		System.out.print("Escreva um n�mero:");
		numero = ler.nextInt();
		
		if(numero %2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("O n�mero %d � par e sua raiz quadrada � %.2f",numero, raiz);
		}else {
			quadrado = Math.pow(numero, 2);
			System.out.printf("O numero %d � impar e seu quadrado � %.2f",numero, quadrado);
		}
	}

}
