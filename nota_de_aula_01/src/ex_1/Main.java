package ex_1;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é sua matricula: ");
        f.setMatricula(sc.nextInt());
        System.out.println("Digite seu nome completo: ");
        f.setNome(sc.next());
        System.out.println("Informe seu salário bruto: ");
        f.setSalario(sc.nextDouble());

        System.out.println("Sua matricula: "+ f.getMatricula());
        System.out.println("Nome: "+ f.getNome());
        System.out.println("Seu salario bruto: "+ f.getSalario());
        System.out.println("Valor de Desconto dos 15%:");f.deducao();
        System.out.println("O salário liquido: "); f.liquido();



    }
}