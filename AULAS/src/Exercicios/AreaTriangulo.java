package Exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Triangulo t3 = new Triangulo(); // objeto
		
		int a1=0, a2=0, a3=0, b1=0, b2=0, b3=0, h1=0,h2=0, h3=0;
		int maior =0;
		
		System.out.println("Escreva a base do triângulo 1:");
		b1 = ler.nextInt();
		System.out.println("Escreva a base do triângulo 2:");
		b2 = ler.nextInt();
		System.out.println("Escreva a base do triângulo 3:");
		b3 = ler.nextInt();
		
		System.out.println("Escreva a altura do triângulo 1:");
		h1 = ler.nextInt();
		System.out.println("Escreva a altura do triângulo 2:");
		h2 = ler.nextInt();
		System.out.println("Escreva a altura do triângulo 3:");
		h3 = ler.nextInt();
		
		a1 = (int)Math.pow((b1 * h1), 2);
		a2 = (int)Math.pow((b2 * h2), 2);
		a3 = (int)Math.pow((b3 * h3), 2);
		
		if(a1 > a2 && a1 > a3) {
			maior = a1;
		} else if(a2 > a1 && a2 > a3) {
			maior = a2;
		} else if(a3 > a1 && a3 > a2) {
			maior = a3;
		}
		System.out.printf("A area do triângulo 1: %d\n",a1);
		System.out.printf("A area do triângulo 2: %d\n",a2);
		System.out.printf("A area do triângulo 3: %d\n",a3);
		System.out.printf("A maior area é %d", maior);

		t3.base = ler.nextDouble();
	}

}
