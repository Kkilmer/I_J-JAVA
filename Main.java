import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("Qual seu nome?");
        p.nome = sc.next();
        System.out.println("Qual sua idade?");
        p.idade = sc.nextInt();

        System.out.println("antiga: "+ p.idade);
        p.niver();
        System.out.println("atual: "+ p.idade);

    }
}
