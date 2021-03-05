package APLICACAO;

import java.util.Scanner;

import CLASSES.ContaEstudantil;
import CLASSES.ContaPoupanca;

public class CaixaEletronico 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int opcao;// variavel utilizada para saber se o usuario deseja continuar
		int data;// usada para saber o aniversario da poupanca
		char movimento;//usada para saber se a pessoa quer a opcao de debito(-) ou credito(+)
		int operacoes=0;//usada para contar as operacoes q o usario faz(no maximo 10 pela regra estabelecida no do while())
		double valor;//usada para guardar o valor q o usuario movimenta
		
		//vetor que guarda as opcoes de conta
		String opcoes[] = {"[1] |POUPANÇA|", "[2] |OUTRO|","[3] |Estudantil|"};
		
		//criei o objeto conta1
		ContaPoupanca conta1 = new ContaPoupanca(1,"1",25);
		ContaEstudantil conta2 = new ContaEstudantil(2,"1",0,true);
		
		//Textos so pra deixar bonito
		System.out.print("|BANCO BANCO|");
		System.out.print("\n|O BANCO DOS BANCOS|");
		
		System.out.print("\nSELECIONE O TIPO DE CONTA: ");
		
		//loop q mostra toda as opcoes de conta
		for(int linha=0; linha<opcoes.length; linha++)
		{
		System.out.printf("\n%s", opcoes[linha]);
		}
		
		System.out.print("\nDIGITE O NÚMERO DA OPÇÃO SELECIONADA: ");
		//variavel que recebe a opcao de conta que o usuario escolheu
		opcao = scan.nextInt();
		
		
		//loop para limpar o console
		for(int limpa=0; limpa<2; limpa++)
		{
			System.out.print("\n");
		}
		
		System.out.print("|BANCO BANCO|");
		System.out.print("\n|O BANCO DOS BANCOS|");
		
		
		//switch q de acordo com o que entra na opcao executa o caso equivalente
		//Exemplo caso escolha 1:{faz oq ta dentro das chaves}
		switch(opcao) 
		{	
			case 1:
			{
				//mostra conta e o tipo de conta de acordo com a posicao 0 do vetor opcoes
				System.out.printf("\nCONTA %s", opcoes[0]);
				
				//pego a data para verificar o aniversario da poupanca
				System.out.printf("\nDIGITE A DATA DE HOJE: ");
				data = scan.nextInt();
				
				//loop para fazer 10 operacoes ou ate digitar N para sair
				do
				{
					System.out.printf("\nSALDO ATUAL: %.2f", conta1.getSaldo());
				
					System.out.print("\nDEBITO OU CREDITO? [D] [C]: ");
					movimento = scan.next().toUpperCase().charAt(0);
				
					System.out.print("DIGITE O VALOR: ");
					valor = scan.nextDouble();
				
					if(movimento=='D') 
					{
						conta1.debito(valor);
					}
					else if(movimento=='C') 
					{
						conta1.credito(valor);
					}
					else
					{
						System.out.print("OPÇÃO INVÁLIDA!");
					}
				
					conta1.correcao(data);
					System.out.print("\nDESEJA FAZER OUTRA OPERAÇÃO ? [S] SIM , [N] NÃO: ");
					opcao = scan.next().toUpperCase().charAt(0);
				
					operacoes++;
				}while(operacoes<10 && opcao=='S');
				
				break;
			}
			case 2:
			{
				System.out.printf("\nCONTA %s", opcoes[0]);
				
				do
				{
					System.out.printf("\nSALDO ATUAL: %.2f", conta1.getSaldo());
				
					System.out.print("\nDEBITO OU CREDITO? [D] [C]: ");
					movimento = scan.next().toUpperCase().charAt(0);
				
					System.out.print("DIGITE O VALOR: ");
					valor = scan.nextDouble();
				
					if(movimento=='D') 
					{
						conta1.debito(valor);
					}
					else if(movimento=='C') 
					{
						conta1.credito(valor);
					}
					else
					{
						System.out.print("OPÇÃO INVÁLIDA!");
					}
				
					System.out.print("\nDESEJA FAZER OUTRA OPERAÇÃO ? [S] SIM , [N] NÃO: ");
					opcao = scan.next().toUpperCase().charAt(0);
				
					operacoes++;
				}while(operacoes<10 && opcao=='S');
				
				break;
			}	
			case 3:
			{
				System.out.printf("\nCONTA %s", opcoes[2]);
				
				System.out.println("\n DESEJA USAR SEU LIMITE ESTUDANTIL [S] SIM , [N] NÂO: ");
				char limite = scan.next().toUpperCase().charAt(0);
				
				if(limite == 'S') {
					System.out.println("\nO LIMITE DE R$5000.00 REAIS AGORA ESTÁ NO SEU SALDO.  ");
					conta2.usarEstudantil(1);
				}else if(limite == 'N') {
					System.out.println("\n O LIMITE ESTUDANTIL NÃO FOI SOLICITADO.");
				}
				
				do
				{
					System.out.printf("\nSALDO ATUAL: %.2f", conta2.getSaldo());
				
					System.out.print("\nDEBITO OU CREDITO? [D] [C]: ");
					movimento = scan.next().toUpperCase().charAt(0);
				
					System.out.print("DIGITE O VALOR: ");
					valor = scan.nextDouble();
				
					if(movimento=='D') 
					{
						conta2.debito(valor);
					}
					else if(movimento=='C') 
					{
						conta2.credito(valor);
					}
					else
					{
						System.out.print("OPÇÃO INVÁLIDA!");
					}
					System.out.print("\nDESEJA FAZER OUTRA OPERAÇÃO ? [S] SIM , [N] NÃO: ");
					opcao = scan.next().toUpperCase().charAt(0);
				
					operacoes++;
				}while(operacoes<10 && opcao=='S' || conta2.getSaldo() == 0);
				
				System.out.printf("\nSALDO ATUAL: %.2f", conta2.getSaldo());
				System.out.println("OPERAÇÃO ENCERRADA");
			}
		}
		
		scan.close();
	}
}
