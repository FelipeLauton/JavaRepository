package POO;

public class Ex2 {

	public static void main(String[] args) {
		
		//Crie uma classe avião e apresente os atributos e métodos referentes
		//esta classe, em seguida crie um objeto avião, defina as instancias deste
		//objeto e apresente as informações deste objeto no console
		
		//definindo a instancia do objeto
		Aviao aviao = new Aviao("Boing 747-400",416,917);
		System.out.printf("O modelo do avião é o %s, ele tem capacidade para %d passageiros e tem velocidade maxima de %d Km/h", aviao.getModelo(),aviao.getCapacidadePassageiros(),aviao.getVelocidadeMaxima());

	}

}
