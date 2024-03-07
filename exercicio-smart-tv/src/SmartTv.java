public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal ( int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual é: " + canal);
    }
    
    public void ligar(){
        ligada=true;
    
    }
    public void desligada(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentado o volume para " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void passarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void voltarCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }
}