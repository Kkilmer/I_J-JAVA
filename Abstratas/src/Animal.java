public abstract class Animal {
    protected String nome;
    protected int idade;

    private final TipoAnimal tipo;
    public TipoAnimal getTipo(){
        return tipo;
    }

    public Animal(String nome, int idade, TipoAnimal tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipo=" + tipo +
                '}';
    }
}
}
}
