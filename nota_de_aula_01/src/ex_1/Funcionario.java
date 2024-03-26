package ex_1;

public class Funcionario {
    int matricula;
    String nome;
    double salario, liquido, deducao;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double getLiquido() {
        return liquido;
    }

    public void setLiquido(Double liquido) {
        this.liquido = liquido;
    }

    public double getDeducao() {
        return deducao;
    }

    public void setDeducao(Double deducao) {
        this.deducao = deducao;
    }
    public void deducao(){
        deducao = salario*0.15;
        System.out.println("Desconto: "+ deducao);
    }
    public void liquido(){
        liquido = salario - deducao;
        System.out.println("Liquido: "+ liquido);
    }
}
