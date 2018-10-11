class DadoViciado  {
    public int jogaDado() {
        int face = (int) (Math.random() * 20 + 1);
        return (face > 5) ? 6 : face;
    }
}
