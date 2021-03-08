package CLASSES;

public class ContaPoupanca extends Conta
{
	private int aniversarioPoupanca;


	public ContaPoupanca(int numero, String cpf, int aniversarioPoupanca) {
		super(numero, cpf);
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
	
	
	public void correcao(int data)
	{
		if(this.aniversarioPoupanca==data)
		{		
			System.out.print("\nANIVERSARIO DA POUPANÇA!");
			System.out.printf("\nRENDIMENTO: %.2f", (super.getSaldo()*0.05));
			super.credito(super.getSaldo()*0.05);
		}
	}	
}