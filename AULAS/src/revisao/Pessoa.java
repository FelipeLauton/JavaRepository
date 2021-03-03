package revisao;

public class Pessoa {

	//classe pessoa [terreno]
	//atributos - segurança [material de construção]
	//construtores - forma - peao - maneira - como a classe abre - cria - [pedreiro - Zé]
		//sobrecarga de construtor [pedreiro - Malaquias, Zefa]
	//encapsulamento - getters and setters - segurança - [vigia da obra] --> feijão com arroz.
	//métodos [vai fazer talvez] [casa ou terreno com acabamento]
		//sobrecarga de metodos
	// COM ESSE CONTEUDO O PROJETO DE SEXTA JÁ PODE SER REALIZADO.
	
	//herança - a todo momento
	
	//******acabamento*****
	//override
	//polimorfismo --> não sao necessarios porem deixam mais sofisticado.
	//collections
	//interface
	
	//atributos
	private String nome;
	private int anoNascimento;
	private boolean vivo;
	private char genero;
	
	//construtor
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, int anoNascimento, char genero) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
	}

	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	//metodo
	public int idade() {
		return 2021 - anoNascimento;
	}
	//metodo sobrecarga
	public int idade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
}
