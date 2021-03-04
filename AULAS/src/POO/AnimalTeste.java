package POO;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Preguica preguica = new Preguica();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		preguica.setNome("Preguiça");
		cachorro.setNome("Pintcher");
		cavalo.setNome("Puro Sangue");
		
		System.out.println(preguica.getSom());
		System.out.println(cachorro.getSom());
		System.out.println(cavalo.getSom());

	}

}
