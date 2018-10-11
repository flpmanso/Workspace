public class Teste  {
    public static void main(String[] args) {
        Pato p1 = new PatoMergulhao();
        Pato p2 = new PatoBorracha();
        p1.voar();
        p1.grasnar();
        p1.desenharPato();
        p2.voar();
        p2.grasnar();
        p2.desenharPato();
    }
}