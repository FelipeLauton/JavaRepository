package POO;

public class Ex4 {

	public static void main(String[] args) {
		
		/*Crie uma classe funcion�rio e apresente os atributos e m�todos
		referentes esta classe, em seguida crie um objeto funcion�rio, defina as
		instancias deste objeto e apresente as informa��es deste objeto no
		console.*/
		
		Funcionario1 funcionario = new Funcionario1(2000,"Jose",23);
		System.out.printf("Ol�, %s. Seu id � %d e seu sal�rio � %f",funcionario.getNome(),funcionario.getId(),funcionario.getSalario());
		

	}

}
