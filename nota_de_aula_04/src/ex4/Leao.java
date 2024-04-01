package ex4;

public class Leao extends Animal{
    private String locomoção;
    private String pelo;

    public Leao(String classe, String locomoção, String pelo) {
        super(classe);
        this.locomoção = locomoção;
        this.pelo = pelo;
    }
    public String getLocomocao() {
        return locomoção;
    }

    public String getPelo() {
        return pelo;
    }

    public void exibirInformacoes() {
        System.out.println("Classe:"+getClasse());
        System.out.println("Locomoção:" + locomoção);
        System.out.println("Tipo de pelo:" + pelo);
    }
}
