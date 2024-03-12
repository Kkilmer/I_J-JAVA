public class Gerente extends Funcionario{
    private String departametno;

    public String getDepartametno() {
        return departametno;
    }

    public void setDepartametno(String departametno) {
        this.departametno = departametno;
    }
    public double calcularBonus(){
        return 0.1*getSalario();
    }
}
