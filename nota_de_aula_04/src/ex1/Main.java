package ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno2 a = new Aluno2("Kevin", 23, 10135);
        Professor p = new Professor("Fernanda", 35, 3500.0);

        System.out.println("Nome do Aluno:" + " " + a.getNome() + " " +
                "Idade:" + " " + a.getIdade() + " " + "Matricula: "+ " " + a.getMatricula());
        System.out.println("Nome do Professor:" + " " + p.getNome() + " " + "Idade: " + p.getIdade() +
                " " + "Salario: " + p.getSalario());
    }
}
