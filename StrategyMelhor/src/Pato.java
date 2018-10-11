abstract class Pato {
    public ComportamentoGrasnar cg;
    public ComportamentoVoar cv;

    public void nadar() {
        System.out.println("pato nadando...");
    }

    public void grasnar() {
        cg.grasnar();
    }

    public void voar()  {
        cv.voar();
    }

    public abstract void desenharPato();
}
