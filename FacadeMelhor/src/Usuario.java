import java.util.*;

public class Usuario {
    private String nome;
    private List emprestimos = new ArrayList();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Iterator getEmprestimosAbertos() {
        List lista = new ArrayList();
        for(int i=0; i<emprestimos.size(); i++) {
            Emprestimo e = (Emprestimo)emprestimos.get(i);
            if(e.getDevolucao()==null)   {
                lista.add(e);
            }
        }
        return lista.iterator();
    }

    public void addEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }
}
