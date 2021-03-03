package POO;

public class Funcionario1 {
	
	private double salario;
	private String nome;
	private int id;
	
	//construtor
	public Funcionario1(double salario, String nome, int id) {
		super();
		this.salario = salario;
		this.nome = nome;
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
