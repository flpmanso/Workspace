public class DadoNormal implements IDado {
    int lado;

    public void jogaDado() {
        lado = (int) (Math.random() * 6 + 1);
    }

    public int lerFace() {
        return lado;
    }
}
