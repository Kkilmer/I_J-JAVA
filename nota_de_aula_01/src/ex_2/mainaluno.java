package ex_2;

import java.util.Scanner;
public class mainaluno {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("1º nota: ");
        a.nota1 = sc.nextInt();

        System.out.println("2º nota: ");
        a.nota2 = sc.nextInt();

        System.out.println("3º nota: ");
        a.nota3 = sc.nextInt();

        a.notas();
        System.out.println("Sua media é " + a.media);

        if (a.media >= 70) {
            System.out.println("ex_2.Aluno aprovado!");
        }else{
            System.out.println("ex_2.Aluno reprovado!");
        }


    }
}