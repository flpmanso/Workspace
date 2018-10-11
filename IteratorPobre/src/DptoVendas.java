import java.util.ArrayList;
import java.util.List;

class DptoVendas {
    private static List funcionarios = new ArrayList();

    public void addFuncionario(Pessoa func) {
        funcionarios.add(func);
    }

    public List getColecao() {
        return funcionarios;
    }
}