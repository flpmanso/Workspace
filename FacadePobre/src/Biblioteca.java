import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Biblioteca    {
    private static List usuarios = new ArrayList();

    public static Iterator getUsuarios()    {
        return usuarios.iterator();
    }

    public static void addUsuario(Usuario usuario)  {
        usuarios.add(usuario);
    }
}