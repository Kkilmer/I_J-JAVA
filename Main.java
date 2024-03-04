import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("Qual seu nome?");
        p.setNome(sc.next());
        System.out.println("Qual sua idade?");
        p.setIdade(sc.nextInt());

        System.out.println("A idade é: "+ p.getIdade());
        System.out.println("O seu nome é: " + p.getNome());

    }
}
