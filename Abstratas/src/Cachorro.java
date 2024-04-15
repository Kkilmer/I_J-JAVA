import java.util.Scanner;
public class Cachorro extends Animal implements Correr{

    Scanner sc = new Scanner(System.in);
    public Cachorro(String nome, int idade){
        super(nome, idade, tipo);
    }
    @Override
    public void emitirSom(){
        System.out.println("Au, au");
    }
    @Override
    public void correr(){
        System.out.println("Estou correndo au, au...");

    }

}
