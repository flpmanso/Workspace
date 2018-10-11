import java.util.Iterator;

public class Teste {
    private static DptoMarketing dMarketing = new DptoMarketing();
    private static DptoVendas dVendas = new DptoVendas();
    private static DptoCompras dCompras = new DptoCompras();

    static {   // inicialização
        dMarketing.addFuncionario(new Pessoa("Manoel", 4000));
        dMarketing.addFuncionario(new Pessoa("Mauro", 4000));
        dVendas.addFuncionario(new Pessoa("Vinicius", 3000));
        dVendas.addFuncionario(new Pessoa("Vitor", 3000));
        dCompras.addFuncionario(new Pessoa("Cardoso", 2000));
        dCompras.addFuncionario(new Pessoa("Celso", 2000));
    }

    public static void main(String[] args) {
        Iterator it = dVendas.getIterator();
        while(it.hasNext()) {
            Pessoa pessoa = (Pessoa) it.next();
            System.out.println(pessoa.getNome() + "; " + pessoa.getSalario());
        }

        it = dMarketing.getIterator();
        while(it.hasNext()) {
            Pessoa pessoa = (Pessoa) it.next();
            System.out.println(pessoa.getNome() + "; " + pessoa.getSalario());
        }

        it = dCompras.getIterator();
        while(it.hasNext()) {
            Pessoa pessoa = (Pessoa) it.next();
            System.out.println(pessoa.getNome() + "; " + pessoa.getSalario());
        }
    }
}
