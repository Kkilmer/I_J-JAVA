import java.util.Scanner;

public class Passaro extends Animal implements Voar{
    Scanner sc = new Scanner(System.in);
    public Passaro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Miau, miau");
    }
    @Override
    public void voando(){
        System.out.println("Voando bem Alto!!");
    }
}
