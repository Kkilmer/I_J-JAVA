package ex4;
import java.util.Scanner;
public class MainA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();

        System.out.println("Exibir informações do Leão!");
        leao.exibirInformacoes();

        System.out.println("Exibir informações da ARARA: " +arara.getClasse());

        System.out.println("Locomoção: " +arara.getLocomocao());
        System.out.println("Quantidade de ovos:" +arara.getQtdeOvos());
    }
}
