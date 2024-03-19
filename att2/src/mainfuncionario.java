import java.util.Scanner;
public class mainfuncionario {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite o valor da hora trabalhada:");
        f.setValorHoras(sc.nextDouble());
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        f.setHorasTrabalhadas(sc.nextInt());

        f.calcularSalario();
    }
}