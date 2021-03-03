package POO;

public class Aviao {
	
	//atributos
	private String modelo;
	private int capacidadePassageiros;
	private int velocidadeMaxima;
	
	//construtor
	public Aviao(String modelo, int capacidadePassageiros, int velocidadeMaxima) {
		super();
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	//encapsulamento
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	//metodo
	public char decolar() {
		
		if(decolar() == 'S') {
			System.out.println("O avião atingiu a velocidade e decolou!");
		}
		else if (decolar() == 'N') {
			System.out.println("O avião não decolou!");
		}
		return decolar();
	}
	
	

}
