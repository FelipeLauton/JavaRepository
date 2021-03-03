package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Conta conta3 = new Conta(345, "111.222.333-00", true);
        double valor;
        char opcao;

        System.out.println("Digite o valor:");
        valor = leia.nextDouble();
        System.out.println("Debito ou Credito? D/C:");
        opcao = leia.next().toUpperCase().charAt(0);
        if (opcao =='D')
        {
            conta3.debito(valor);
        }
        else if (opcao =='C') {

            conta3.credito(valor);
        } else
        {
            System.out.println("Opção invalida!!!");
        }
        System.out.println("Saldo atual: "+conta3.getSaldo());
    }

}