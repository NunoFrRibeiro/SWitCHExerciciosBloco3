import java.util.Scanner;

public class Bloco3Ex11 {
    public static void main(String[] args) {
        somaIgualNumero();
    }

    public static void somaIgualNumero(){
        Scanner ler = new Scanner(System.in);
        int contador1 = 0;
        int contador2 = 0;
        int numero;
        System.out.println("Qual é o número interiro de 1 a 20");
        numero = ler.nextInt();
        do {
            if (numero <= 0 || numero >= 21){
                System.out.println("O número não está entre 0 e 20");
                System.out.println("Introduzir novo número entre 0 e 20");
                numero = ler.nextInt();
            }
        } while (numero <= 0 || numero >= 21);
        do {
            do {
                if ((contador1 + contador2) == numero){
                    System.out.println(contador1 + " + " + contador2 + " =  " + numero);
                }
                contador2++;
            } while (contador2 < 11);
            contador2 = 0;
            contador1++;
        } while (contador1 <= numero / 2);
    }

    public static void somaIgualNumero2(){
        Scanner ler = new Scanner(System.in);
        int contador1 = 10;
        int contador2 = 10;
        int numero;
        System.out.println("Qual é o número inteiro de 1 a 20");
        numero = ler.nextInt();
        do {
            if (numero <= 0 || numero >= 21){
                System.out.println("O número não está entre 0 e 20");
                System.out.println("Introduzir novo número entre 0 e 20");
                numero = ler.nextInt();
            }
        } while (numero <= 0 || numero >= 21);
        do {
            do {
                if ((contador1 + contador2) == numero) {
                    System.out.println(contador1 + " + " + contador2 + " =  " + numero);
                }
                contador2--;
            }while (contador2 >= 0);
            contador1--;
        } while (contador1 >= 0);
    }

    public static void somaIgualNumero3(){
        Scanner ler = new Scanner(System.in);
        int contador = 0;
        int i;
        int numero;
        System.out.println("Qual é o número inteiro de 1 a 20");
        numero = ler.nextInt();
        do {
            if (numero <= 0 || numero >= 21){
                System.out.println("O número não está entre 0 e 20");
                System.out.println("Introduzir novo número entre 0 e 20");
                numero = ler.nextInt();
            }
        } while (numero <= 0 || numero >= 21);
        for (i = 0; i <= 10; i++){
            if ((numero / 2 + i) == numero){
                System.out.println(i + " + " + (numero / 2) + " = " + numero);
            }
        }
    }
}
