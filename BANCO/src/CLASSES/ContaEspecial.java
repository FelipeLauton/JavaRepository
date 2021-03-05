package CLASSES;

public class ContaEspecial extends Conta {
	//double: limite
	//(-) usarLimite: double
	//Usar o limite do saldo se no momento do movimento o saldo fica negativo, ajusta no saldo e diminuir no limite.
	
	//ATRIBUTO
	private double limite;
	//private int quantidadeMovimentos =0;
	
	//CONSTRUTOR
	//public ContaEspecial(int numero, double limite) {
	//	super(numero);
	//	this.limite = limite;
	//}
	//CONSTRUTOR - sobrecarga
	 public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
		}
	
	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	}
	//ENCAPSULAMENTO
	//public void setQuantidadeMovimentos() {
	//	this.quantidadeMovimentos+=1;
	//}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	//metodos
	public void usarlimite(double valor) {
		//double saldo = this.getSaldo();
		if (valor <= saldo) {
			this.saldo = saldo- valor;
			System.out.println("Debito aprovado!!");
		}
		else if (valor<=limite && valor>saldo ) {
			//limite = (saldo+limite) - valor;
			//saldo = valor;
			//saldo-=valor;
			//limite = limite-saldo;
			//limite -=valor;
			//saldo += valor;
			limite = limite -(valor-saldo);
			saldo =0;
			System.out.println("Debito aprovado!!");
			System.out.println("Voce usou do seu Limite Especial. Verifique seu saldo e limite no seu App.");
		}
		//teste else inicio
		else if(valor > limite && valor > saldo && valor<(saldo+limite)) {
			limite = limite -(valor-saldo);
			saldo =0;
			System.out.println("Debito aprovado!!");
			System.out.println("Voce usou do seu Limite Especial. Verifique seu saldo e limite no seu App.");
		}//teste else fim
		else if (valor > (saldo+limite)) {
			System.out.println("Esta operação excede o seu Saldo e o Limite!");
		}
		else if(saldo == 0 && valor >limite) {
			System.out.println("Voce não tem saldo e limite suficiente!");
		}		
    }
	/*@Override
	public void credito(double valor) {
		super.credito(valor);
		setQuantidadeMovimentos();*/
	}
