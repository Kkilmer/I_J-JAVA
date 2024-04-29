import java.util.ArrayList;

public class CadastroPessoas {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    public void cadastrarPessoa(Pessoa p){
        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listar(){
        for (Pessoa p : pessoas){
            System.out.println("Nome: " + p.getNome() + " " + "Idade: "+ p.getIdade());
        }
    }

    private ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<PessoaFisica>();

    public void cadastrarPessoaFisica(PessoaFisica pf){
        pessoasFisicas.add(pf);
        System.out.println("Pessoa cadastrada com sucesso!");
    }
    private ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    public void cadastrarPessoaJuridica(PessoaJuridica pj){
        pessoasJuridicas.add(pj);
        System.out.println("Pessoa cadastrada com sucesso!");
    }
    public void listarPolimorficos(){
        ArrayList<Pessoa>pessoasPolimorficas = new ArrayList<>();
        pessoasPolimorficas.addAll(pessoasFisicas);
        pessoasPolimorficas.addAll(pessoasJuridicas);

        for (Pessoa p : pessoasPolimorficas){
            if (p instanceof PessoaFisica){
                System.out.println("Nome: "+ p.getNome()+ ", Idade:" + p.getIdade()+ ", CPF:" +
                        ((PessoaFisica)p).getCpf());
            }else if (p instanceof PessoaJuridica){
                System.out.println("Nome: "+ p.getNome()+ ", Idade:" + p.getIdade()+ ", CNPJ:" +
                        ((PessoaJuridica)p).getCnpj());
            }else {
                System.out.println("Nome:" +p.getNome()+ ", Idade:"+ p.getIdade());
            }
        }
    }
}
