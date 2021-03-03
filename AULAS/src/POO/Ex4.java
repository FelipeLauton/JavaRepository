package POO;

public class Ex4 {

	public static void main(String[] args) {
		
		/*Crie uma classe funcionário e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto funcionário, defina as
		instancias deste objeto e apresente as informações deste objeto no
		console.*/
		
		Funcionario1 funcionario = new Funcionario1(2000,"Jose",23);
		System.out.printf("Olá, %s. Seu id é %d e seu salário é %f",funcionario.getNome(),funcionario.getId(),funcionario.getSalario());
		

	}

}
