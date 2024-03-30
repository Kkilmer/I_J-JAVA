package ex2;

import java.util.Scanner;
public class mainprod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Estoque e = new Estoque();

        System.out.println("Leitura de Estoque");
        System.out.println("Digite a quantidade atual em estoque:");
        e.setValoratual(sc.nextInt());
        System.out.println("Digite a quantidade de produtos(max) recebidos:");
        e.setQtdmax(sc.nextInt());
        System.out.println("Digite a quantidade reservada(min) em estoque:");
        e.setQtdmin(sc.nextInt());


        e.getmedia();
        e.getresultado();



    }
}
