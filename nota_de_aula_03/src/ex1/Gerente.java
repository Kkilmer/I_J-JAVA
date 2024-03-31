package ex1;

public class Gerente extends Funcionario{
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departametno){
        this.departamento= departametno;
    }
    public double calcularBonus(){
        return salario*0.1;

    }
}
