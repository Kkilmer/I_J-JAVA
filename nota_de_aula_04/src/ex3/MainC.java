package ex3;
import java.util.Scanner;
public class MainC {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Carro car = new Carro("Toyota", "Corolla");
        car.mostrarDetalhes();
    }
}
