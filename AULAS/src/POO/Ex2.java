package POO;

public class Ex2 {

	public static void main(String[] args) {
		
		//Crie uma classe avi�o e apresente os atributos e m�todos referentes
		//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
		//objeto e apresente as informa��es deste objeto no console
		
		//definindo a instancia do objeto
		Aviao aviao = new Aviao("Boing 747-400",416,917);
		System.out.printf("O modelo do avi�o � o %s, ele tem capacidade para %d passageiros e tem velocidade maxima de %d Km/h", aviao.getModelo(),aviao.getCapacidadePassageiros(),aviao.getVelocidadeMaxima());

	}

}
