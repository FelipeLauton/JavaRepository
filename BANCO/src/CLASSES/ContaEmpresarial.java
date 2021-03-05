package CLASSES;

import java.util.Scanner;

public class ContaEmpresarial extends Conta 
{
    /*
     * Solicitar a qualquer tempo ou após os 10 movimentos o uso do emprestimo 
     * (limitado a R$ 10.000) levando o valor para o saldo.
     */

    Scanner ler = new Scanner(System.in);
    double emprestimoEmpresa = 0;

    public ContaEmpresarial(int numero, String cpf) 
    {
        super(numero, cpf);
        this.emprestimoEmpresa = emprestimoEmpresa;
    }

    public void pedirEmprestimo()
    {
        System.out.println("Deseja solicitar empréstimo: S-sim ou N-não");
        char opcaoEmp;
        opcaoEmp = ler.next().toUpperCase().charAt(0);

        if (opcaoEmp == 'S')
        {
            System.out.println("Digite o valor que deseja pegar emprestado: ");
            double valor = ler.nextDouble();

            if (valor + emprestimoEmpresa <= 10000) 
            {
                FazerEmprestimo(valor);
            }
            else
            {
                System.out.println("Opa! Valor indisponível");
            }
        }
    }

    public void FazerEmprestimo(double valor)
    {

        emprestimoEmpresa = emprestimoEmpresa + valor;
        this.saldo = this.saldo + emprestimoEmpresa;

        //credito(valor);
        System.out.println("Saldo Atual R$: " + saldo);
    }

    @Override
    public void debito(double valor) 
    {
        this.saldo = this.saldo - valor;
    }

    @Override
    public void credito(double valor) 
    {
        if (valor <= saldo) 
        {
            System.out.println("Valor insuficiente em conta.");
            if (emprestimoEmpresa < 10000) 
            {
                pedirEmprestimo();
                debito(valor);
        }
        else 
        {
            this.saldo = this.saldo + valor;
            System.out.println("Saldo Atual R$" + this.saldo);
            }
        }
    }
}