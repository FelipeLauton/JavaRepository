package CLASSES;

import java.util.Scanner;

public class ContaCorrente extends Conta {
    Scanner leia = new Scanner (System.in);

    private int contadorTalao;
    private char resposta; //RESPOSTA PARA A PERGUNTA: DESEJA SOLICITAR UM CHEQUE?
    private int totalChoques = 3;
    private char respostaSair;// variavel para contar as vezes que podem ser pedidas
    //PASSAR A VARIAVEL OPCAO PARA O MEU PROGRAMA

    //CONSTRUTOR
    public ContaCorrente(int numero, String cpf, boolean ativa, int contadorTalao) {
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
    //condição para o cheque 
    //if (getOpcao == 'N') {
    {
        while (contadorTalao < 3)
        {
            System.out.println("Deseja solicitar um cheque?");
            resposta = leia.next().toUpperCase().charAt(0);

            if (resposta == 's' && resposta == 'S') {
                contadorTalao -= 1;

                    System.out.println("O total de cheques é " + contadorTalao);
            }

            else if (resposta == 'N' && resposta == 'n')
            {
                System.out.println("Deseja finalizar a operação?");
                respostaSair = leia.next().toUpperCase().charAt(0);

                if (respostaSair == 'S' || respostaSair == 's') 
                {
                    contadorTalao = 4;
                }

            }
            else
            {
            System.out.println("Resposta inválida");
            }
        }
    }
}