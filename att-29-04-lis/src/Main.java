import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String r;
        Scanner sc = new Scanner(System.in);
        CadastroPessoas cp = new CadastroPessoas();
        do {
            System.out.println("Digite 1 para novo cadastrar Pessoa Física, Digite 2 para cadastrar Pessoa Jurídica");
            int repetir = sc.nextInt();
            switch (repetir) {
                case 1:
                    PessoaFisica pf = new PessoaFisica();
                    System.out.println("Digite o nome da pessoa a ser cadastrada:");
                    pf.setNome(sc.next());
                    System.out.println("Digite a idade da pessoa a ser cadastrada:");
                    pf.setIdade(sc.nextInt());
                    cp.cadastrarPessoa(pf);
                    cp.listar();
                    break;
                case 2:
                    PessoaJuridica pj = new PessoaJuridica();
                    System.out.println("Digite o nome da pessoa a ser cadastrada:");
                    pj.setNome(sc.next());
                    System.out.println("Digite a idade da pessoa a ser cadastrada:");
                    pj.setIdade(sc.nextInt());
                    cp.cadastrarPessoa(pj);
                    cp.listar();
                    break;
                default:
                    System.out.println("Cadastro concluido!");
                    break;
                }
        System.out.println("Digite 'Novo' para fazer um novo cadastro");
        r = sc.next();
        }while (r.equalsIgnoreCase("Novo"));

    }
}