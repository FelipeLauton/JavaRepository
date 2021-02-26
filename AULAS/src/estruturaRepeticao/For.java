package estruturaRepeticao;

public class For {

	public static void main(String[] args) {
		
		int x, soma = 0;
		
		for(x=1;x<=10;x++) {            // testeando a estrutura de repetição for
			System.out.printf("\n %d",x);
			soma = soma + x;
		}
        System.out.printf("\nSoma total: %d",soma);
	}

}
