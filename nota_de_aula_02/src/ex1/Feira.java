package ex1;

public class Feira {
    private int macas;
    private double qtd;
    public int getMacas() {
        return macas;
    }

    public void setMacas(int macas) {
        this.macas = macas;
    }
    public void getCusto(){
        if(macas > 12){
            qtd = macas * 1.00;
            System.out.println("R$1,00 por cada unidade. "+ "Total: " + qtd);
        }else if (macas < 12) {
            qtd = macas * 1.30;
            System.out.println("R$1,30 por cada unidade. " + "Total: "+ qtd);
        }
    }

}
