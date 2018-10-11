public class Teste  {
    public static void main(String[] args) {
        Pato p = new PatoMergulhao();
        p.voar();
        System.out.println("modificando o comportamento do pato...");
        p.setCV(new CV3());
        p.voar();
    }
}