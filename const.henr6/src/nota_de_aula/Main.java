package nota_de_aula;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno2 a = new Aluno2("Kevin", 23, 10135);
        Professor p = new Professor("Fernanda", 35, 3.000);

        System.out.println("Nome do Aluno:"+ a.getNome() +
                "Idade:"+ a.getIdade() + "Matricula:"+ a.getMatricula());
    }
}
