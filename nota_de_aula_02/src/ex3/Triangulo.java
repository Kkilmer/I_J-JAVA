package ex3;

public class Triangulo {
    private double ladoA, ladoB, ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public void Resultado(){
        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("Esse é um Triângulo Equilátero");
        } else if (ladoA == ladoB){
            System.out.println("Esse é um Triângulo Isósceles");
        } else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
            System.out.println("Esse é um Triângulo Escaleno");
        }else {
            System.out.println("Os lados fornecidos não formam um Triângulo");
        }
    }
}
