import java.util.Scanner;

public class Bloco3Ex19 {
    public static void main(String[] args) {
        verificacaoParImpar();
    }
    public static void verificacaoParImpar(){
        Scanner read = new Scanner(System.in);
        int algarismo, numPares = 0, numImpar = 0;
        do {
            System.out.println("Qual é o algarismo");
            algarismo = read.nextInt();
            if (algarismo <= 0 || algarismo >9) {
                System.out.println("O algarismo tem que estar entre 1 e 9");
                System.out.println("Introduza novo alagrismo");
            } else
                if (ePar(algarismo)){
                    numPares = (numPares * 10) + algarismo;
                }else {
                    numImpar = (numImpar * 10) + algarismo;
                }
        } while (algarismo >= 0);
        System.out.println(numPares + "" + numImpar);
    }

    public static boolean ePar(int n){
        boolean result;
        if ((n % 2) == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
