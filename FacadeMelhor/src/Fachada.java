import java.util.*;

class Fachada {
    public Iterator getTitulosEmprestados() {
        List titulosEmprestados = new ArrayList();

        Iterator usuarios = Biblioteca.getUsuarios();
        while(usuarios.hasNext())   {
            Usuario usuario = (Usuario)usuarios.next();
            Iterator emprestimos = usuario.getEmprestimosAbertos();
            while(emprestimos.hasNext()) {
                Emprestimo emprestimo = (Emprestimo)emprestimos.next();
                Livro livro = emprestimo.getLivro();
                titulosEmprestados.add(livro.getTitulo());
            }
        }
        
        return titulosEmprestados.iterator();
    }
}