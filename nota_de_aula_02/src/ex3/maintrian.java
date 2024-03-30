package ex3;
import java.util.Scanner;
public class maintrian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.println("Digite o lado 1: ");
        t.setLadoA(sc.nextDouble());
        System.out.println("Digite o lado 2: ");
        t.setLadoB(sc.nextDouble());
        System.out.println("Digite o lado 3: ");
        t.setLadoC(sc.nextDouble());

        System.out.println("O resultado da pesquisa:");t.Resultado();

    }
}
