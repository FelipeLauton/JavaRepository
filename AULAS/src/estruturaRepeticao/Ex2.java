package estruturaRepeticao;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		//3- Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0;
		int total21 = 0, total50 = 0;
		
		System.out.print("Digite uma idade:");
		idade = input.nextInt();
		
		while(idade != -99) {
		
			if(idade < 21) {
				total21 = total21 + 1;
			} else if(idade > 50){
				total50 = total50 + 1;
			}
			System.out.print("Digite outra idade:");
			idade = input.nextInt();
			
		}
		System.out.printf("\nO total de pessoas com menos de 21 anos � %d e o total com mais de 50 � %d ",total21,total50);
	}

}
