package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Conta conta1 = new Conta(1, "111.111.111-11");
		
		conta1.credito(100);
		conta1.debito(100);
		
		System.out.println();
		
		
	}

	
}
