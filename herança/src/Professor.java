public class Professor extends Pessoa {
    private double salario, valorHora, qtdHora;

    public double getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(double qtdHora) {
        this.qtdHora = qtdHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public void calc_Pro(){ salario = valorHora * qtdHora;
        System.out.println("O valor do salario é: R$" + salario);
    }
}
