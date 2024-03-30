package ex2;

public class Estoque {
    private int qtdmax, qtdmin, valoratual;
    private double media;

    public int getQtdmax() {
        return qtdmax;
    }

    public int getValoratual() {
        return  valoratual;
    }

    public void setValoratual(int estoque) {
        this.valoratual = estoque;
    }

    public void setQtdmax(int qtdmax) {
        this.qtdmax = qtdmax;
    }

    public int getQtdmin() {
        return qtdmin;
    }

    public void setQtdmin(int qtdmin) {
        this.qtdmin = qtdmin;
    }
    public void getmedia() {
        media = (double) (qtdmax + qtdmin) / 2;
        System.out.println("A média do estoque: " + media);
    }

    public void getresultado() {
        if (valoratual >= media) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}