public class IMC_calc {
    private double imc, peso, altura;

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getImc(){
        return imc;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void calcula_imc(){
        imc = peso / (altura * altura);
        System.out.printf("%.2f%n", imc);
    }
}
