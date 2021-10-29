import java.util.Scanner;

public class Bloco3Ex18 {
    public static void main(String[] args) {
        //conquetenacao();
        //somaPonderada();
        //verificacaoAlgarismos();
        verificacaoCCProcessamento();
    }

    public static void verificacaoCCProcessamento(){
        Scanner read = new Scanner(System.in);
        int numCC;
        int numExtra;
        System.out.println("Qual é o número do CC?");
        numCC = read.nextInt();
        System.out.println("Qual é o numero à direita do número da CC?");
        numExtra = read.nextInt();
        if (verificacaoAlgarismos(numCC) && numExtra > 0 && numExtra < 9) {
            int conq = conquetenacao(numCC, numExtra);
            int somaPond = somaPonderada(conq);
            if ((somaPond % 11) == 0){
                System.out.println("O número do CC é válido.");
            } else {
                System.out.println("Número do CC inválido");
            }
        } else {
            System.out.println("Inputs inválidos.");
        }
    }

    public static int conquetenacao(int numCC, int numExtra){
        int conquetenacao = (numCC * 10) + numExtra;
        return conquetenacao;
    }

    public static int somaPonderada(int conquetenacao){
        int somaPond = 0;
        int n = 1;
        do {
            somaPond = somaPond + (conquetenacao % 10) * n;
            conquetenacao = conquetenacao / 10;
            n++;
        } while (conquetenacao > 0);
        return somaPond;
    }

    public static boolean verificacaoAlgarismos(int numCC){
        boolean resultado;
        int n = 0;
        do {
            numCC = numCC / 10;
            n++;
        } while (numCC > 0);
        if (n == 8){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
