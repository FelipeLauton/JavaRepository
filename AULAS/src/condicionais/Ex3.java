package condicionais;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		//3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
		//categoria ela se encontra:
			
			Scanner ler = new Scanner(System.in);
			int idade;
			
			System.out.printf("Digite sua idade:");
			idade = ler.nextInt();
			
			if(idade >= 10 && idade <= 14) {
				System.out.printf("Voc� est� na categoria Infantil");
			}else if(idade >= 15 && idade <= 17){
				System.out.printf("Voc� est� na categoria Juvenil");
			}else if(idade >= 18 && idade <= 25){
				System.out.printf("Voc� est� na categoria Adulto");
			}else {
				System.out.printf("Voc� n�o est� em nenhuma categoria.");
			}
	}

}
