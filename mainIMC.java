import java.util.Scanner;
public class mainIMC {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);
        IMC_calc i = new IMC_calc();

        System.out.println("Qual seu peso?");
        i.setPeso(sc.nextDouble());
        System.out.println("Qual Altura?");
        i.setAltura(sc.nextDouble());

        i.calcula_imc();
        System.out.println("IMC " + i.getImc());

    }
}