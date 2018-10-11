import java.util.*;

class Emprestimo    {
    private Date dtEmprestimo;
    private Date dtDevolucao = null;
    private Livro livro;

    public Emprestimo(Date dtEmprestimo, Livro livro) {
        this.dtEmprestimo = dtEmprestimo;
        this.livro = livro;
    }

    public Date getDevolucao()  {
        return dtDevolucao;
    }

    public Livro getLivro()  {
        return livro;
    }

    public void encerra(Date dt)    {
        dtDevolucao = dt;
    }
}