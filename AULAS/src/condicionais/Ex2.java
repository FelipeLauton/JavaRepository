package condicionais;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner ler = new Scanner(System.in);
		int x, y, z;
		
	    System.out.printf("Digite um numero:\n ");
	    x = ler.nextInt();
	    System.out.printf("Digite um numero:\n ");
	    y = ler.nextInt();
	    System.out.printf("Digite um numero:\n ");
	    z = ler.nextInt();

	    if (x<y&&y<z){
	    	System.out.printf("A ordem crescente �: %d %d %d ", x, y, z);
	    }
	    else if (x<z&&z<y){
	    	System.out.printf("A ordem crescente �: %d %d %d ", x, z, y);
	    }
	    else if (y<x&&x<z){
	    	System.out.printf("A ordem crescente �: %d %d %d ", y, x, z);
	    }
	    else if (y<z&&z<x){
	    	System.out.printf("A ordem crescente �: %d %d %d ", y, z, x);
	    }
	    else if (z<x&&x<y){
	    	System.out.printf("A ordem crescente �: %d %d %d ", z, x, y);
	    }
	    else{
	    	System.out.printf("A ordem crescente �: %d %d %d ", z, y, x);
	    }
	}

}
