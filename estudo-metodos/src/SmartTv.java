public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar() {
        ligada = true;
        System.out.println("ligando tv");
    }

    public void desligar() {
        ligada = false;
        System.out.println("desligado tv");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("aumentando volume em: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("diminuindo volume em: " + volume);
    }
    public void mudarCanal(int numero) {
        canal = numero; 
        System.out.println("mudando canal em: " + canal);
    }
    
}