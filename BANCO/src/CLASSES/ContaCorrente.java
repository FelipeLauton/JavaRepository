package CLASSES;

public class ContaCorrente extends Conta {

    protected int contadorTalao;

    //CONSTRUTOR
    public ContaCorrente(int numero, String cpf, int contadorTalao) {
        super(numero, cpf);
        this.contadorTalao = contadorTalao;
    }
    //ENCAPSULAMENTO
    public int getContadorTalao() {
        return contadorTalao;
    }

    public void setContadorTalao(int contadorTalao) {
        this.contadorTalao = contadorTalao;
    }
   
   
    public void pediTalao()
    {
    	contadorTalao--;	
    	System.out.printf("Quantidade de talões: %d", contadorTalao);
    }   
}