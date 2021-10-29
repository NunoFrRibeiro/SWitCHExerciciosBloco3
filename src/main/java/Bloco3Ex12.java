import java.util.Scanner;

public class Bloco3Ex12 {

    public static void main(String[] args) {
        numeroRaizes();
    }

    public static void numeroRaizes(){
        double raiz1;
        double raiz2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual é o Valor de (a)?");
        int varA = ler.nextInt();
        System.out.println("Qual é o Valor de (b)?");
        int varB = ler.nextInt();
        System.out.println("Qual é o Valor de (c)?");
        int varC = ler.nextInt();
        double delta = (Math.pow(varB,2) - (4 * varA * varC));
        if (varA == 0){
            System.out.println("Não é uma equação de 2º Grau");
        } else if (delta == 0){
                System.out.println("Só tem uma Raiz.");
                System.out.println("Raiz = " + ((-varB) / (2 * varA)));
        } else if (delta > 0) {
                System.out.println("Tem duas raízes.");
                raiz1 = ((- varB - Math.sqrt(delta)) / (2 * varA));
                raiz2 = ((- varB + Math.sqrt(delta)) / (2 * varA));
                System.out.println("Raiz 1 = " + raiz1);
                System.out.println("Raiz 2 = " + raiz2);
        } else if (delta < 0){
            System.out.println("A equação tem raízes imaginárias.");
        }
    }
}
