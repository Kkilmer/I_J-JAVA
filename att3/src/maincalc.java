import java.util.Scanner;
public class maincalc {
    public static void main(String[] args) {
        System.out.println();

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

            int n1, n2;
            int i = 0;

            while (i <= 5){
            System.out.println("Número 1");
            n1 = sc.nextInt();

            System.out.println("Número 2");
            n2 = sc.nextInt();

            System.out.println(c.somar(n1, n2));
        }

    }
}