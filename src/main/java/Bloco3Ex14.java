import java.util.Objects;
import java.util.Scanner;

public class Bloco3Ex14 {
    public static void main(String[] args) {
        cambio();
    }

    public static void cambio(){
        Scanner ler = new Scanner(System.in);
        String cambioD = "D";
        String cambioL = "L";
        String cambioI = "I";
        String cambioC = "C";
        String cambioF = "F";
        double valorCambio;
        double cambioFinal = 0;
        do {
            System.out.println("Qual é a moeda pretendida?");
            System.out.println("Dólar (D), Libra (L), Iene (I), Coroa Sueca (C), Franco Suiço (F)");
            String cambioPretendido = ler.next();
            if (Objects.equals(cambioPretendido, cambioD)){
                System.out.println("Qual é o valor?");
                valorCambio = ler.nextDouble();
                cambioFinal = valorCambio * 1.534;
                System.out.println("O valor é " + cambioFinal + " Dólares");
            }else if (Objects.equals(cambioPretendido, cambioL)){
                System.out.println("Qual é o valor?");
                valorCambio = ler.nextDouble();
                cambioFinal = valorCambio * 0.774;
                System.out.println("O valor é " + cambioFinal + " Libras");
            } else if (Objects.equals(cambioPretendido, cambioI)){
                System.out.println("Qual é o valor?");
                valorCambio = ler.nextDouble();
                cambioFinal = valorCambio * 161.480;
                System.out.println("O valor é " + cambioFinal + " Ienes");
            } else if (Objects.equals(cambioPretendido, cambioC)){
                System.out.println("Qual é o valor?");
                valorCambio = ler.nextDouble();
                cambioFinal =valorCambio * 9.593;
                System.out.println("O valor é " + cambioFinal + " Coroas Suecas");
            } else if (Objects.equals(cambioPretendido, cambioF)){
                System.out.println("Qual é o valor?");
                valorCambio = ler.nextDouble();
                cambioFinal = valorCambio * 1.601;
                System.out.println("O valor é " + cambioFinal + " Francos Suiços");
            } else if (Objects.equals(cambioPretendido, null)){
                System.out.println("Qual é o valor?");
                cambioFinal = ler.nextDouble();
            }
        } while (cambioFinal > 0);
    }
}
