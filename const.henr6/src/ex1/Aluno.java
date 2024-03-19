package ex1;

public class Aluno extends Pessoa {//Filho
    private int matricula;

    public  Aluno(String nome, int mat){
        super(nome);//para chamar o contrutor do Pai "super"
        this.matricula = mat;
    }
}
