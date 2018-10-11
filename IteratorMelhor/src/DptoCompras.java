import java.util.HashMap;
import java.util.Iterator;

class DptoCompras {
    private HashMap funcionarios = new HashMap();

    public void addFuncionario(Pessoa func) {
        funcionarios.put(func.getNome(), func);
    }

    public Iterator getIterator() {
        return funcionarios.values().iterator();
    }
}
