public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.desligar();
        smartTv.ligar();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Canal está em: " + smartTv.canal);
        smartTv.mudarCanal(30);
    }
}
