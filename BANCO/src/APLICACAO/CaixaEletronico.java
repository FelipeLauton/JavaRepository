package APLICACAO;

import java.util.Scanner;

import CLASSES.ContaCorrente;
import CLASSES.ContaEmpresarial;
import CLASSES.ContaEspecial;
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
		char resposta;
		
		//vetor que guarda as opcoes de conta
		String opcoes[] = {"[1] |POUPANÇA  |", "[2] |CORRENTE  |", "[3] |ESPECIAL  |", "[4] |EMPRESA   |", "[5] |ESTUDANTIL|"};
		
		//criei o objeto conta1
		ContaPoupanca conta1 = new ContaPoupanca(1,"1",25);
		ContaCorrente conta2 = new ContaCorrente(2,"2",true,3);
		ContaEspecial conta3 = new ContaEspecial(3,"3",1000);
		ContaEmpresarial conta4 = new ContaEmpresarial(4,"4",10000);
		ContaEstudantil conta5 = new ContaEstudantil(5,"5",0,true);
		
		//Textos so pra deixar bonito
		System.out.print("|DIVERSITY BANK G3|");
		System.out.print("\n|O BANCO DA DIVERSIDADE|");
		
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
		
		System.out.print("|DIVERSITY BANK G3|");
		System.out.print("\n|O BANCO DA DIVERSIDADE|");
		
		
		//switch q de acordo com o que entra na opcao executa o caso equivalente
		//Exemplo caso escolha 1:{faz oq ta dentro das chaves}
		switch(opcao) 
		{	
			case 1:
			{
				//mostra conta e o tipo de conta de acordo com a posicao 0 do vetor opcoes
				System.out.printf("\nCONTA %s", opcoes[0]);
				
				//loop para fazer 10 operacoes no maximo ou ate digitar qualquer outra caractere q nao seja o S
				do
				{
					//pego a data para verificar o aniversario da poupanca
					System.out.printf("\nDIGITE A DATA DE HOJE: ");
					data = scan.nextInt();
					
					System.out.printf("\nSALDO ATUAL: %.2f", conta1.getSaldo());
				
					System.out.print("\nDEBITO OU CREDITO? [D] [C]: ");
					movimento = scan.next().toUpperCase().charAt(0);
				
				
					if(movimento=='D') 
					{
						System.out.print("DIGITE O VALOR: ");
						valor = scan.nextDouble();
						conta1.debito(valor);
					}
					else if(movimento=='C') 
					{
						System.out.print("DIGITE O VALOR: ");
						valor = scan.nextDouble();
						conta1.credito(valor);
					}
					else
					{
						System.out.print("OPÇÃO INVÁLIDA!");
					}
				
					conta1.correcao(data);
					System.out.printf("\nSALDO ATUAL: %.2f", conta1.getSaldo());
					
					System.out.print("\nDESEJA FAZER OUTRA OPERAÇÃO ? [S] SIM , [N] NÃO: ");
					opcao = scan.next().toUpperCase().charAt(0);
				
					operacoes++;
				}while(operacoes<10 && opcao=='S');
				
				System.out.printf("\nSALDO ATUAL: %.2f", conta1.getSaldo());
				
				break;
			}
			case 2:
			{
				System.out.printf("\nCONTA %s", opcoes[1]);
				
				do
				{
					System.out.printf("\nSALDO ATUAL: %.2f", conta2.getSaldo());
				
					System.out.print("\nDEBITO OU CREDITO? [D] [C]: ");
					movimento = scan.next().toUpperCase().charAt(0);
				
					
				
					if(movimento=='D') 
					{
						System.out.print("DIGITE O VALOR: ");
						valor = scan.nextDouble();
						conta2.debito(valor);
					}
					else if(movimento=='C') 
					{
						System.out.print("DIGITE O VALOR: ");
						valor = scan.nextDouble();
						conta2.credito(valor);
					}
					else
					{
						System.out.print("OPÇÃO INVÁLIDA!");
					}
				
					System.out.print("\nDESEJA FAZER OUTRA OPERAÇÃO ? [S] SIM , [N] NÃO: ");
					opcao = scan.next().toUpperCase().charAt(0);
				
					operacoes++;
				}while(operacoes<10 && opcao=='S');
				
				System.out.printf("\nSALDO ATUAL: %.2f", conta2.getSaldo());
				
				System.out.printf("VOCÊ TEM %d TALÕES", conta2.getContadorTalao());
				
				do 
				{
					System.out.println("\nDESEJA SOLICITAR UM TALÃO? [S] SIM , [N] NÃO:");
		            resposta = scan.next().toUpperCase().charAt(0);
					
		            if (resposta == 'S')
		            {
						conta2.pediTalao();
					}
					
					if(conta2.getContadorTalao()==0)
					{
						System.out.print("\nVOCÊ NÃO TEM MAIS TALÕES!"); 
					}
					
				}while(conta2.getContadorTalao()>0 && resposta=='S');
				
					
				break;
			}
			case 3:
			{
				System.out.printf("\nCONTA %s", opcoes[2]);

                do
                {
                    System.out.printf("\nSALDO ATUAL: %.2f", conta3.getSaldo());
                    System.out.printf("\nLIMITE ESPECIAL ATUAL: %.2f", conta3.getLimite());
                    System.out.println();//Pular uma linha para separar a pergunta seguinte dessa parte

                    System.out.print("\nDEBITO OU CREDITO? [D] [C]: ");
                    movimento = scan.next().toUpperCase().charAt(0);

                    if(movimento=='D') 
                    {
                        System.out.print("DIGITE O VALOR: ");
                        valor = scan.nextDouble();
                        conta3.usarlimite(valor);
                    }
                    else if(movimento=='C') 
                    {
                        System.out.print("DIGITE O VALOR: ");
                        valor = scan.nextDouble();
                        conta3.credito(valor);
                    }
                    else
                    {
                        System.out.print("OPÇÃO INVÁLIDA!");
                    }

                    System.out.print("\nDESEJA FAZER OUTRA OPERAÇÃO ? [S] SIM , [N] NÃO: ");
                    opcao = scan.next().toUpperCase().charAt(0);

                    operacoes++;
                }while(operacoes<10 && opcao=='S');

                //Msg para o usuario apos 10 movimentaçoes
                if (operacoes == 10) {
                    System.out.println("Voce chegou ao limite de 10 movimentações");
                }

                System.out.printf("\nSALDO ATUAL: %.2f", conta3.getSaldo());
                System.out.printf("\nLIMITE ESPECIAL ATUAL: %.2f", conta3.getLimite());
                break;
			}
			case 4:
			{
				System.out.printf("\nCONTA %s", opcoes[3]);
                do
                {
                System.out.printf("\nSALDO ATUAL: %.2f", conta4.getSaldo());

                System.out.print("\nDEBITO OU CREDITO? [D] [C]: ");
                movimento = scan.next().toUpperCase().charAt(0);

                
                if(movimento=='D') 
                {
                	System.out.print("DIGITE O VALOR: ");
                    valor = scan.nextDouble();
                    conta4.debito(valor);
                }
                else if(movimento=='C') 
                {
                	System.out.print("DIGITE O VALOR: ");
                    valor = scan.nextDouble();
                    conta4.credito(valor);
                }
                else
                {
                    System.out.print("OPÇÃO INVÁLIDA!");
                }

                conta4.pedirEmprestimo();

                System.out.print("\nDESEJA FAZER OUTRA OPERAÇÃO ? [S] SIM , [N] NÃO: ");
                opcao = scan.next().toUpperCase().charAt(0);

                operacoes++;

                }while(operacoes<10 && opcao=='S');

                break;
			}
			
			case 5:
			{
				System.out.printf("\nCONTA %s", opcoes[4]);

                System.out.println("\n DESEJA USAR SEU LIMITE ESTUDANTIL [S] SIM , [N] NÂO: ");
                char limite = scan.next().toUpperCase().charAt(0);

                if(limite == 'S') {
                    System.out.println("\nO LIMITE DE R$5000.00 REAIS AGORA ESTÁ NO SEU SALDO.  ");
                    conta5.usarEstudantil(1);
                }else if(limite == 'N') {
                    System.out.println("\n O LIMITE ESTUDANTIL NÃO FOI SOLICITADO.");
                }

                do
                {
                    System.out.printf("\nSALDO ATUAL: %.2f", conta5.getSaldo());

                    System.out.print("\nDEBITO OU CREDITO? [D] [C]: ");
                    movimento = scan.next().toUpperCase().charAt(0);

                    

                    if(movimento=='D') 
                    {
                    	System.out.print("DIGITE O VALOR: ");
                        valor = scan.nextDouble();
                        conta5.debito(valor);
                    }
                    else if(movimento=='C') 
                    {
                    	System.out.print("DIGITE O VALOR: ");
                        valor = scan.nextDouble();
                        conta5.credito(valor);
                    }
                    else
                    {
                        System.out.print("OPÇÃO INVÁLIDA!");
                    }
                    System.out.print("\nDESEJA FAZER OUTRA OPERAÇÃO ? [S] SIM , [N] NÃO: ");
                    opcao = scan.next().toUpperCase().charAt(0);

                    operacoes++;
                }while(operacoes<10 && opcao=='S' || conta5.getSaldo() == 0);

                System.out.printf("\nSALDO ATUAL: %.2f", conta5.getSaldo());
                System.out.println("OPERAÇÃO ENCERRADA");
                break;
			}
			
			default:
			{
				System.out.print("\nESCOLHA UMA OPÇÃO VALIDA!");
				break;
			}
		}
		scan.close();
	}
}