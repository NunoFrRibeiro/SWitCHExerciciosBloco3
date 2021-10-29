import java.util.Scanner;

public class Bloco3Ex15 {
    public static void main(String[] args) {
        notasAlunos();
    }

    public static void notasAlunos(){
        Scanner read = new Scanner(System.in);
        int notaInteira;
        int contador = 0;
        do {
            contador++;
            System.out.println("Qual é a nota do aluno " + contador);
            notaInteira = read.nextInt();
            if (notaInteira >= 0 && notaInteira <= 4){
                System.out.println("Mau");
            } else
                if (notaInteira >= 5 && notaInteira <= 9){
                    System.out.println("Mediocre");
                } else
                    if(notaInteira >= 10 && notaInteira <= 13){
                        System.out.println("Suficiente");
                    } else
                        if (notaInteira >= 14 && notaInteira <= 17) {
                            System.out.println("Bom");
                        } else
                            if(notaInteira >= 18 && notaInteira <= 20) {
                                System.out.println("Muito Bom");
                            }
        } while (notaInteira >= 0);
    }
}
