package funcoes;

public class Pedrao {

	public static void main(String[] args) {
		
		/*Escreva um programa que printe no console números de 1 a 100. Porém, para os números múltiplos de 3,
		 printe "Hello" ao invés do número. Para múltiplos de 5, printe "World". 
		 Para múltiplos de 3 e 5 printe "Hello World"  -
		 */
		int numero = 0;
		
		for(numero=1; numero<=100; numero++) {
			if(numero %3 == 0) {
				System.out.println("Hello");
			} if(numero %5 == 0) {
				System.out.println("World");
			} if(numero %3 == 0 && numero %5 == 0) {
				System.out.println("Hello World");
			}
			System.out.println(numero);
		}
	}

}
