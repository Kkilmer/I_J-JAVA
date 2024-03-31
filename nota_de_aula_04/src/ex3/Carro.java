package ex3;

public class Carro {
    private String marca, modelo;

    public Carro(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    public void mostrarDetalhes(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
