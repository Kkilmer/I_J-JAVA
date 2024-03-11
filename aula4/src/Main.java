import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Professor pro = new Professor();
        Aluno a = new Aluno();

        System.out.println("Você é: Professor digite 1, senão 2 eu sou Aluno");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Digite o nome do Professor");
                pro.setNome(sc.next());
                System.out.println("Digite o valor da hora trabalhada: ");
                pro.setValorHora(sc.nextDouble());
                System.out.println("Digite a quantidade de horas trabalhadas: ");
                pro.setQtdHora(sc.nextDouble());

                pro.calc_Pro();
                System.out.println("Valor do salario é: "+ pro.getSalario());
                break;
            case 2:
                System.out.println("Eu sou Aluno");
                System.out.println("1º nota: ");
                a.setNota1(sc.nextDouble());
                System.out.println("2º nota: ");
                a.setNota2(sc.nextDouble());
                System.out.println("3º nota: ");
                a.setNota3(sc.nextDouble());
                a.notas();
                System.out.println("Valor da media"+ a.getMedia());
                break;

            default:
                System.out.println("Informação Invalida");

        }


    }
}