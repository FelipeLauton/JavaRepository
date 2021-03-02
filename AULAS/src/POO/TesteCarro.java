package POO;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.cor = "vermelho";
		meuCarro.modelo = "Nissan";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 240;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
		meuCarro.acelera(40);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
		

	}

}
