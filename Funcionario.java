public class Funcionario {

    private double valorHoras, salario;
    private int horasTrabalhadas;

    public void setValorHoras(double valorHoras){
        this.valorHoras = valorHoras;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void calcularSalario(){
        salario = valorHoras * horasTrabalhadas;
        System.out.println("O valor do salario é: R$ " + salario);
    }
}
