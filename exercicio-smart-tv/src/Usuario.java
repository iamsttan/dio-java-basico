public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println( "Estado da TV: " + smartTv.ligada);
        System.out.println( "Canal atual: " + smartTv.canal);
        System.out.println( "Volume atual: " + smartTv.volume);


        // entrada comandos usuario

        smartTv.ligar();
        System.out.println("Novo Status -> Estado da TV:" + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();

        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();

        smartTv.voltarCanal();
        smartTv.mudarCanal(15);
        }

    }

