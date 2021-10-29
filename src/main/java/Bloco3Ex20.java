import java.util.Scanner;

public class Bloco3Ex20 {
    public static void main(String[] args) {
        //somaDivisores(9);
        verificacaoNumerosProcessamento();
    }

    public static void verificacaoNumerosProcessamento(){
        int numero, somaDiv;
        Scanner read = new Scanner(System.in);
        System.out.println("Qual é o algarismo a verificar?");
        numero = read.nextInt();
        somaDiv = somaDivisores(numero);
        if (numero == somaDiv){
            System.out.println("É um número perfeito");
        } else if(numero < somaDiv) {
            System.out.println("É um número Abundante");
        } else{
            System.out.println("É um número reduzido");
        }
    }

    public static int somaDivisores(int numero){
        int resultado = 0, contador = 1;
        do {
            if ((numero % contador) == 0) {
                resultado = resultado + contador;
            }
            contador++;
        } while (contador < numero);
        return resultado;
    }
}
