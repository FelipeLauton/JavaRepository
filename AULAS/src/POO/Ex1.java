package POO;

public class Ex1 {
	
	public static void main(String[] args) {
		
		/*Crie uma classe cliente e apresente os atributos e m�todos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informa��es deste objeto no console.
		*/
		
		ClienteEx1 cliente = new ClienteEx1("Anderson","222.333.444-31",1920);
		System.out.println("Ol�, "+ cliente.getNome()+ " seu CPF � "+ cliente.getCpf()+ " e sua idade � "+ cliente.getAnoNascimento());
		
		
		
	}

}
