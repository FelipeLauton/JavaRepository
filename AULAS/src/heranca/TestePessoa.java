package heranca;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa jessica = new Pessoa("Jessica",555);
		Funcionario pedro = new Funcionario("Pedro",222,"TI");
		Pessoa maria = new Funcionario("Maria",333,"Informatica-Dev");
		Pessoa jose = new Cordenador("Jos�",245,"Ci�ncias da Computa��o");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}
