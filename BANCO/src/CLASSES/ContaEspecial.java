package CLASSES;
//pronto
public class ContaEspecial extends Conta {
	//double: limite
	//(-) usarLimite: double
	//Usar o limite do saldo se no momento do movimento o saldo fica negativo, ajusta no saldo e diminuir no limite.
	
	//ATRIBUTO
	private double limite;
	
	//CONSTRUTOR 
	 public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
		}
	//Sobrecarga construtor
	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	}
	//ENCAPSULAMENTO
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	//metodos
	public void usarlimite(double valor) {
		if (valor <= super.getSaldo()) {
			super.debito(valor);
			System.out.println("Debito aprovado!!");
		}
		else if (valor<=limite && valor>super.getSaldo() ) {
			double p = valor - super.getSaldo();
			super.credito(p);
			limite = limite - p;
			super.debito(valor);
			System.out.println("Debito aprovado!!");
			System.out.println("Voce usou do seu Limite Especial. Verifique seu saldo e limite no seu App.");
		}
		else if(valor >= limite && valor > super.getSaldo() && valor<=(super.getSaldo()+limite)) {
			double p = valor - super.getSaldo();
			super.credito(p);
			limite = limite - p;
			super.debito(valor);
			System.out.println("Debito aprovado!!");
			System.out.println("Voce usou do seu Limite Especial. Verifique seu saldo e limite no seu App.");
		}
		else if (valor > (super.getSaldo()+limite)) {
			System.out.println("Esta operação excede o seu Saldo e o Limite!");
		}	
    }
}