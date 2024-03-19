import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Carro c = new Carro("Audi", "A3", 2024);//construtor

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual ano é seu carro?");
        c.setAno(sc.nextInt());
        System.out.println("Qual seu novo modelo do seu carro?");
        c.setModelo(sc.next());
        System.out.println("Qual nova marca do seu carro?");
        c.setMarca(sc.next());
        //set gera a pergunta e alteração do blocos acima.

        System.out.println(c.getModelo());
        System.out.println(c.getAno());
        System.out.println(c.getMarca());
        //get para imprime a alteraçao do set atualizando o menu da Class Carro.

        Carro c2 = new Carro("Audi", "A30");

        System.out.println(c2.getMarca());
        System.out.println(c2.getModelo());



    }
}