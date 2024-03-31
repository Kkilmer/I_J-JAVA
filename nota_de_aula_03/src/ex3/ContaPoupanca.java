package ex3;

public class ContaPoupanca {
    private double depositar, sacar, calcularRendimento, selic;

    public double getSelic() {
        //selic = 10.75;
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getCalcularRendimento() {
        if(getSelic() > 8.5){
            calcularRendimento = 0.005*depositar;
        }else{
            calcularRendimento =0.007*getSelic()*depositar;
        }
        return calcularRendimento;
    }

    public void setCalcularRendimento(double calcularRendimento) {
        this.calcularRendimento = calcularRendimento;
    }
}
