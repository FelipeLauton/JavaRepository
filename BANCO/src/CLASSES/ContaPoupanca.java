package CLASSES;

public class ContaPoupanca extends Conta
{
	private int aniversarioPoupanca;

	public ContaPoupanca(int numero, String cpf, int aniversarioPoupanca) {
		super (numero, cpf);
		this.aniversarioPoupanca = aniversarioPoupanca;
	}

	public ContaPoupanca(int numero) {
		super(numero);
	}

	public ContaPoupanca(int numero, String cpf, boolean ativa) {
		super(numero, cpf, ativa);
	}

	public int getAniversarioPoupanca() {
		return aniversarioPoupanca;
	}

	public void setAniversarioPoupanca(int aniversarioPoupanca) {
		this.aniversarioPoupanca = aniversarioPoupanca;
	}
	
	@Override
	public void credito(double valor) 
	{
		this.saldo += valor;
	}
	
	public void correcao(int data)
	{
		if(this.aniversarioPoupanca==data) 
		{	
			this.saldo += (this.saldo*0.05);
			
			System.out.print("ANIVERSARIO DA POUPANÇA!");
		}
	}
}