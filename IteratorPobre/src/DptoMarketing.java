class DptoMarketing {
    private int pos = 0;
    private final int DIM = 10;
    private Pessoa funcionarios[] = new Pessoa[DIM];

    public void addFuncionario(Pessoa func) {
        if (pos >= DIM) return;
        funcionarios[pos] = func;
        pos++;
    }

    public Pessoa[] getColecao() {
        return funcionarios;
    }
}
