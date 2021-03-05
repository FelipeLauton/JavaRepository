package DEUPAU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		String nomes[] = {"João","Maria","Pedro"};
		try {
			System.out.printf("Digite o número da posição do vetor [0-2]: ");
			numero = leia.nextInt();
		
			System.out.println("O número escolhido foi: "+nomes[numero]);
		
		}
		catch(InputMismatchException e) {
			System.out.println("Você digitou uma letra ao invés de número!");
		}
		catch(ArrayIndexOutOfBoundsException m) {
			System.out.println("Você colocou um valor diferente de 0, 1, 2.");
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
