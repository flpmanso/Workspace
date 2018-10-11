public class Teste  {
    public static void main(String[] args) {
        Pato p[] = {new PatoMergulhao(), new PatoRuivo(), new PatoBorracha(), new PatoIsca()};
        for(int i=0; i<p.length; i++)   {
            p[i].desenharPato();
            p[i].nadar();
            p[i].voar();
            p[i].grasnar();
            System.out.println();
        }
    }
}