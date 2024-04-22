import java.util.Scanner;

public class Gato extends Animal  implements Correr{
    Scanner sc = new Scanner(System.in);
    public Gato(String nome, int idade, TipoAnimal tipo){
        super(nome, idade, tipo);
    }
    @Override
    public void emitirSom(){
        System.out.println("Miau, miau");
    }
    @Override
    public void correr(){
        System.out.println("Estou correndo au, au...");

    }
}
