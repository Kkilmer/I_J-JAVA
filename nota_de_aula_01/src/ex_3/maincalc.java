package ex_3;

import java.util.Scanner;
public class maincalc {
    public static void main(String[] args) {
        System.out.println();

    Calculadora c = new Calculadora();
    Scanner sc = new Scanner(System.in);

        int n1, n2;
        int i, resposta;
        do {
            System.out.println("Digite 1: Adição / Digite 2: Subtração / Digite 3: Divisão / Digite 4: Multiplicação.");
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    System.out.println("Número 1");
                    n1 = sc.nextInt();
                    System.out.println("Número 2");
                    n2 = sc.nextInt();
                    System.out.println(c.somar(n1, n2));
                    break;
                case 2:
                    System.out.println("Número 1");
                    n1 = sc.nextInt();
                    System.out.println("Número 2");
                    n2 = sc.nextInt();
                    System.out.println(c.subtracao(n1, n2));
                    break;
                case 3:
                    System.out.println("Número 1");
                    n1 = sc.nextInt();
                    System.out.println("Número 2");
                    n2 = sc.nextInt();
                    System.out.println(c.divisao(n1, n2));
                    break;
                case 4:
                    System.out.println("Número 1");
                    n1 = sc.nextInt();
                    System.out.println("Número 2");
                    n2 = sc.nextInt();
                    System.out.println(c.multiplicacao(n1, n2));
                    break;
            }
            System.out.println("Para repetir degite 0");
            i = sc.nextInt();
        }   while (i ==0);

    }
}