package ARRAYS;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		// Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
		// e em seguida,
		// exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou
		// seja,
		// diagonal principal.
		Scanner ler = new Scanner(System.in);

		int matriz1[][] = new int[3][3];
		int linha, coluna;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor: ");
				matriz1[linha][coluna] = ler.nextInt();
			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.printf("[" + matriz1[linha][coluna] + ']');

			}
			System.out.println("\n");

		}

	}
}