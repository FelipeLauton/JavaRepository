package condicionais;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade = 0;
		
		System.out.printf("Ol� nadador, digite sua idade para classificarmos sua categoria:");
		idade = ler.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.printf("Voc� est� na categoria Infantil A");
		}else if(idade >= 8 && idade <= 11){
			System.out.printf("Voc� est� na categoria Infantil B");
		}else if(idade >= 12 && idade <= 13){
			System.out.printf("Voc� est� na categoria Juvenil A");
		}else if(idade >= 14 && idade <= 17){
			System.out.printf("Voc� est� na categoria Juvenil B");
		}else if(idade >= 18){
			System.out.printf("Voc� est� na categoria Maiores de 18 anos");
		}else if(idade <= 4) {
			System.out.printf("Infelizmente n�o podemos atender!");
		}
			System.out.printf("\nObrigado, volte sempre!");
		

	}

}
