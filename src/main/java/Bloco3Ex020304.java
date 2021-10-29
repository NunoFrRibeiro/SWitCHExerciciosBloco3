import java.util.Scanner;

public class Bloco3Ex020304 {
    public static void main(String[] args){
        //exercicio2();
        //exercicio3();
    }

    public static void exercicio2(){
        Scanner ler = new Scanner(System.in);
        int nota;
        int i = 1;
        int positivas = 0;
        int somaNegativas = 0;
        System.out.println("Indique o número de alunos.");
        int nrAlunos = ler.nextInt();
        do {
            System.out.println("Indique a nota do aluno " + i);
            nota = ler.nextInt();
            if (nota >= 10){
                positivas ++;
            } else {
                somaNegativas += nota;
            }
            i++;
        } while (i <= nrAlunos);
        System.out.println("% de positivas = " + ((positivas * 100) / nrAlunos));
        System.out.println("Média negativas = " + (somaNegativas * 1.0) / (nrAlunos - positivas));
    }

    public static void exercicio3(){
        Scanner ler = new Scanner(System.in);
        int numero; int somaImpares = 0; int impares = 0;
        int i = 0; int pares = 0;
        int p = 0;
        do {
            System.out.println("Qual é o número?");
            numero = ler.nextInt();
            if (numero < 0){
                p = -1;
            } else if ((numero % 2) == 0) {
                    pares ++;
                    i++;
            } else
                {
                    somaImpares += numero;
                    impares ++;
                    i++;
                }
        } while (p != -1);
        System.out.println("A percentagem de números pares é: " + ((pares * 100) / i));
        System.out.println("A média de números impares é: " + (somaImpares * 1.0 / impares));
    }

    public static int exercicio4A(int limInf, int limSup){
        int counter = 0;
        if (limInf >= limSup) {
            throw new IllegalArgumentException("Limites incorrectos");
        }

        do {
            if (limInf % 3 == 0) {
                counter ++;
                }
                    limInf ++;
        } while (limInf < limSup);
        return counter;
    }

    public static int exercicio4B(int limInf, int limSup, int num){
       int counter = 0;
       if (limInf >= limSup) {
           throw new IllegalArgumentException("Limites incorrectos");
       }
       do {
           if (limInf % num == 0){
               counter ++;
           }
           limInf ++;
       } while (limInf < limSup);
       return counter;
    }

    public static int exercicio4C(int limInf, int limSup){
        int counter = 0;
        if (limInf >= limSup) {
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do {
            if (limInf % 3 == 0) {
                counter ++;
            } else if ( limInf % 5 == 0) {
                counter ++;
            }
            limInf ++;
        } while (limInf < limSup);
        return counter;
    }

    public static int exercicio4D(int limInf, int limSup, int numA, int numB){
        int counter = 0;
        if (limInf >= limSup) {
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do {
            if (limInf % numA == 0){
                counter ++;
            } else if (limInf % numB == 0) {
                counter ++;
            }
            limInf ++;
        } while (limInf < limSup);
        return counter;
    }

    public static int exercicio4E(int limInf, int limSup, int numA, int numB){
        int somaMult = 0;
        if (limInf >= limSup) {
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do {
            if (limInf % numA == 0){
                somaMult += limInf;
            } else if (limInf % numB == 0) {
                somaMult += limInf;
            }
            limInf ++;
        } while (limInf < limSup);
        return somaMult;
    }
}
