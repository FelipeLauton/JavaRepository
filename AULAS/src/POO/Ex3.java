package POO;

public class Ex3 {

	public static void main(String[] args) {
		
		//Crie uma classe produto eletr�nico e apresente os atributos e m�todos
		//referentes esta classe, em seguida crie um objeto produto eletr�nico,
		//defina as instancias deste objeto e apresente as informa��es deste objeto
		//no console.
		
		Eletronico iphone = new Eletronico(523,"Iphone 11","223-231-444","Apple");
		System.out.printf("O seu chip � %d, o modelo do seu eletronico � %s, sendo da empresa %s e tendo o n�mero serial %s",iphone.getChip(),iphone.getModelo(),iphone.getEmpresa(),iphone.getNumeroDeSerie());

	}

}
