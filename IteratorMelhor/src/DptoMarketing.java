import java.util.Iterator;

class DptoMarketing {
    private int pos = 0;
    private final int DIM = 10;
    private Pessoa funcionarios[] = new Pessoa[DIM];

    public void addFuncionario(Pessoa func) {
        if (pos >= DIM) return;
        funcionarios[pos] = func;
        pos++;
    }

    public Iterator getIterator() {
        return new IteratorArray(funcionarios);
    }
}