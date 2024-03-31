package ex3;

import java.util.Scanner;

public class MainBnco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        int i, escolha;
        do {
            System.out.println("Digite 1 para: Conta Correnete || Digite 2 para: Conta Poupança");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite valor do deposito: ");
                    cc.setDepositar(sc.nextDouble());
                    System.out.println("Digite o valor do saque: ");
                    cc.setSacar(sc.nextDouble());
                    System.out.println("Valor disponivel do Cheque Especial: " + cc.getChequeEspecial());
                    break;
                case 2:
                    System.out.println("Saldo em Conta P: ");
                    cp.setDepositar(sc.nextDouble());
                    System.out.println("Digite o valor do saque P: ");
                    cp.setSacar(sc.nextDouble());
                    System.out.println("Qual valor atual da Selic?");
                    cp.setSelic(sc.nextDouble());
                    System.out.println("Valor do Calculo de Rendimento: " + cp.getCalcularRendimento());
                    break;
            }
            System.out.println("Para acessar novamente digite 0");
            i = sc.nextInt();
            }while(i==0);
        }
    }



