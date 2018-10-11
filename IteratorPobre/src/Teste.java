import java.util.List;

public class Teste {
    private static DptoMarketing dMarketing = new DptoMarketing();
    private static DptoVendas dVendas = new DptoVendas();

    static {   // inicialização
        dMarketing.addFuncionario(new Pessoa("Manoel", 4000));
        dMarketing.addFuncionario(new Pessoa("Mauro", 4000));
        dVendas.addFuncionario(new Pessoa("Vinicius", 2000));
        dVendas.addFuncionario(new Pessoa("Vitor", 2000));
    }

    public static void main(String[] args) {
        List lista = dVendas.getColecao();
        for (int i = 0; i < lista.size(); i++) {
            Pessoa pessoa = (Pessoa) lista.get(i);
            System.out.println(pessoa.getNome() + "; " + pessoa.getSalario());
        }

        Pessoa array[] = dMarketing.getColecao();
        for (int i = 0; i < array.length; i++) {
            Pessoa pessoa = array[i];
            if(pessoa==null) break;
            System.out.println(pessoa.getNome() + "; " + pessoa.getSalario());
        }
    }
}
