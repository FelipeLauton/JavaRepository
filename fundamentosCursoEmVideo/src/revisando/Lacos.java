package revisando;

public class Lacos {

	public static void main(String[] args) {
		
		int x, soma= 0;
		
		for(x = 1; x<= 100; x++) {
			System.out.printf("\n %d",x);
			soma = soma + x;
		}
		System.out.printf("\nSoma total = %d", soma);
	}
}
