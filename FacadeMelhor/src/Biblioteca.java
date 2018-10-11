import java.util.*;

class Biblioteca    {
    private static List usuarios = new ArrayList();

    public static Iterator getUsuarios()    {
        return usuarios.iterator();
    }

    public static void addUsuario(Usuario usuario)  {
        usuarios.add(usuario);
    }
}