package CLASSES;

public class ContaCorrente extends Conta {

    protected int contadorTalao;

    //CONSTRUTOR
    public ContaCorrente(int numero, String cpf,boolean ativa, int contadorTalao) {
        super(numero, cpf, ativa);
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
    	System.out.printf("QUANTIDADE DE TALÕES DISPONIVEIS: %d", contadorTalao);
    }   
}