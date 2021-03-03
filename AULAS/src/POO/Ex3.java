package POO;

public class Ex3 {

	public static void main(String[] args) {
		
		//Crie uma classe produto eletrônico e apresente os atributos e métodos
		//referentes esta classe, em seguida crie um objeto produto eletrônico,
		//defina as instancias deste objeto e apresente as informações deste objeto
		//no console.
		
		Eletronico iphone = new Eletronico(523,"Iphone 11","223-231-444","Apple");
		System.out.printf("O seu chip é %d, o modelo do seu eletronico é %s, sendo da empresa %s e tendo o número serial %s",iphone.getChip(),iphone.getModelo(),iphone.getEmpresa(),iphone.getNumeroDeSerie());

	}

}
