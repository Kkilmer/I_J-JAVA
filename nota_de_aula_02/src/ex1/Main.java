package ex1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Feira f = new Feira();

        System.out.println("Bem-vinda! Lojas de Maças(Promoções)");
        System.out.println("Quantidade de Produtos:");
        f.setMacas(sc.nextInt());

        System.out.println("Quantidades de maças: "+ f.getMacas());
        System.out.println("VALOR DA COMPRA: ");f.getCusto();
    }
}