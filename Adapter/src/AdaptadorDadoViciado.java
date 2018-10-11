class AdaptadorDadoViciado implements IDado  {
    private DadoViciado dado = new DadoViciado();

    private int face = 1;

    public int lerFace() {
        return face;
    }

    public void jogaDado() {
        face = dado.jogaDado();
    }
}
