import java.lang.reflect.AnnotatedArrayType;

public class Principal {
    public static void main(String[] args){

        Transformacao t = new Transformacao();

        Animal c1 = new Cachorro("Bilel", 2, TipoAnimal.MAMIFERO);
        t.praticarCorrida((Correr) c1);

        Animal c2 = new Gato("Caco", 6, TipoAnimal.MAMIFERO);
        t.praticarCorrida((Correr) c2);

        Animal c3 = new Passaro("Pepi", 5, TipoAnimal.AVE);
        t.praticarVoo((Voar) c3);



        c1.emitirSom();
        ((Cachorro)c1).correr();

        c2.emitirSom();
        ((Gato)c2).correr();

        c3.emitirSom();
        ((Passaro)c3).voando();
    }
}
