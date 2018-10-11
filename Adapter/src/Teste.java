class Teste {
    public static void main(String args[]) {
        IDado dadoNormal = new DadoNormal();
        IDado dadoViciado = new AdaptadorDadoViciado();

        for (int i=1; i<10; i++)    {
            dadoNormal.jogaDado();
            System.out.println(dadoNormal.lerFace());
        }

        System.out.println();

        for (int i=1; i<10; i++)    {
            dadoViciado.jogaDado();
            System.out.println(dadoViciado.lerFace());
        }
    }
}
