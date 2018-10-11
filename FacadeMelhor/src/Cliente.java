import java.util.*;

class Cliente   {
    private Usuario u1, u2;
    private Emprestimo e1, e2, e3, e4;
    private Livro l1, l2, l3;

    public void init()  {
        Date hoje = new Date(new GregorianCalendar().getTimeInMillis());
        Date ontem = new Date(new GregorianCalendar(2005, 2, 9).getTimeInMillis()); // 9-Marco-2005
        u1 = new Usuario("Jonas Knopman");
        u2 = new Usuario("Eduardo Knopman");
        Biblioteca.addUsuario(u1);
        Biblioteca.addUsuario(u2);
        l1 = new Livro("Martin Fowler", "0321127420", "Patterns of Enterprise Application Architecture");
        l2 = new Livro("Deitel", "8576050196", "Java Como Programar");
        l3 = new Livro("Craig Larman", "0131489062", "Applying UML and Patterns");
        e1 = new Emprestimo(hoje, l1);
        u1.addEmprestimo(e1);
        e2 = new Emprestimo(ontem, l2);
        u1.addEmprestimo(e2);
        e2.encerra(hoje);
        e3 = new Emprestimo(hoje, l2);
        u2.addEmprestimo(e3);
        e4 = new Emprestimo(hoje, l3);
        u2.addEmprestimo(e4);
    }

    public Cliente()    {
        init();

        Fachada fachada = new Fachada();
        Iterator titulos = fachada.getTitulosEmprestados();
        while(titulos.hasNext())    {
            String titulo = (String)titulos.next();
            System.out.println(titulo);
        }
    }

    public static void main(String[] args) {
        new Cliente();
    }
}