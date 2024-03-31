package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Gerente g = new Gerente();
        System.out.println("Digite o nome do ex1.Gerente: ");
        g.setNome(sc.next());
        System.out.println("Digite o departamento do ex1.Gerente: ");
        g.setDepartamento(sc.next());
        System.out.println("Digite o salário do ex1.Gerente: ");
        g.setSalario(sc.nextDouble());

        Diretor d = new Diretor();
        System.out.println("Digite as quantidades de ações do ex1.Diretor: ");
        d.setAcoes(sc.nextInt());

        System.out.println("Dapartamento: "+g.getDepartamento());
        System.out.println("Valor do Bonus +10%: "+g.calcularBonus());
        System.out.println("Ações do ex1.Diretor: "+d.getAcoes());


    }
}