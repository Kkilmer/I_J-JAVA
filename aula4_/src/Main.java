import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        Gerente g = new Gerente();
        System.out.println("Digite o nome do Gerente: ");
        g.setNome(sc.next());
        System.out.println("Digite o departamento do Gerente: ");
        g.setDepartametno(sc.next());
        g.calcularBonus();
        System.out.println("Valor do Bonus"+ g.getSalario());

        Diretor d = new Diretor();
        System.out.println("Digite o nome do Diretor: ");
        d.setNome(sc.next());
        System.out.println("Digite o salario do Diretor: ");
        d.setSalario(sc.nextDouble());
        System.out.println("Quantidades das acoes do Diretor: ");
        d.setAcoes(sc.nextInt());


    }
}