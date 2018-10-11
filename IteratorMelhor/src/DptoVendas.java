import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class DptoVendas {
    private List funcionarios = new ArrayList();

    public void addFuncionario(Pessoa func) {
        funcionarios.add(func);
    }

    public Iterator getIterator() {
//      return new IteratorLista(funcionarios);
        return funcionarios.iterator();
    }
}
