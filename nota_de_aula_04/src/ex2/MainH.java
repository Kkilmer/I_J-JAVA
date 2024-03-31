package ex2;
import java.util.Scanner;
public class MainH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ProdutoH ph1 = new ProdutoH("Nike", "Polo", 200.00);
        ProdutoH ph2 = new ProdutoH("Adidas", "Básica", 60.00);

        System.out.println("Marca:"+" "+ph1.getMarca());
        System.out.println("Modelo:"+" "+ph1.getModelo());
        System.out.println("Preço:"+" "+ph1.getPreco());

        System.out.println(" ");
        System.out.println("Segundo modelo");
        System.out.println(" ");

        System.out.println("Marca:"+" "+ph2.getMarca());
        System.out.println("Modelo:"+" "+ph2.getModelo());
        System.out.println("Preço:"+" "+ph2.getPreco());
    }
}
