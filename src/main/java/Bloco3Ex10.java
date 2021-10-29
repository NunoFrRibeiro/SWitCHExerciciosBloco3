import java.util.Scanner;

public class Bloco3Ex10 {
    public static void main(String[] args) {
        produtoNumeros();
    }

    public static void produtoNumeros(){
        Scanner ler = new Scanner(System.in);
        int limite;
        int numero;
        int maiorNumero = 1;
        int produtoAcumulado = 1;
        int contador = 0;
        System.out.println("Qual é o limite?");
        limite = ler.nextInt();
        do {
            if (limite <= 0){
                System.out.println("Limite inválido.");
                System.out.println("Introduzir novo Limite");
                limite = ler.nextInt();
            }
        }while (limite < 0);
        do {
            contador++;
            System.out.println("Qual é o " + contador + " numero positivo?");
            numero = ler.nextInt();
            do {
                if (numero <= 0){
                    System.out.println("Número inválido.");
                    System.out.println("Introduzir novo número positivo.");
                    numero = ler.nextInt();
                }
            }while (numero <= 0);
                if (numero > maiorNumero){
                    maiorNumero = numero;
                }
                produtoAcumulado = produtoAcumulado * numero;
        }while (produtoAcumulado < limite);

        System.out.println("O maior número introduzido foi " + maiorNumero);
    }
}
