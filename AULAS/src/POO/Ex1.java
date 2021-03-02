package POO;

public class Ex1 {
	
	public static void main(String[] args) {
		
		/*Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
		*/
		
		ClienteEx1 cliente = new ClienteEx1("Anderson","222.333.444-31",1920);
		System.out.println("Olá, "+ cliente.getNome()+ " seu CPF é "+ cliente.getCpf()+ " e sua idade é "+ cliente.getAnoNascimento());
		
		
		
	}

}
