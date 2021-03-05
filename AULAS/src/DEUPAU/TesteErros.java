package DEUPAU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		String nomes[] = {"Jo�o","Maria","Pedro"};
		try {
			System.out.printf("Digite o n�mero da posi��o do vetor [0-2]: ");
			numero = leia.nextInt();
		
			System.out.println("O n�mero escolhido foi: "+nomes[numero]);
		
		}
		catch(InputMismatchException e) {
			System.out.println("Voc� digitou uma letra ao inv�s de n�mero!");
		}
		catch(ArrayIndexOutOfBoundsException m) {
			System.out.println("Voc� colocou um valor diferente de 0, 1, 2.");
		}
		finally {
			
		}
		System.out.println("Fim de programa!!");
		
		//erro de tamanho do vetor
		//java.lang.ArrayIndexOutOfBoundsException
		
		//erro de tipo diferente
		//java.util.InputMismatchException

	}

}
