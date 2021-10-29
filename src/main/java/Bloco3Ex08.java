import java.util.Scanner;

public class Bloco3Ex08 {

    public static void main(String[] args){
        verificacaoMenorNumero();
    }

    public static void verificacaoMenorNumero(){
        int algarismo;
        int soma = 0;
        int n = 1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual é o limite?");
        int num = ler.nextInt();
        int menorAlgarismo = num;
        do{
            System.out.println("Qual é o algarismo numero " + n);
            algarismo = ler.nextInt();
            soma = soma + algarismo;
            if (algarismo < menorAlgarismo){
                menorAlgarismo = algarismo;
            }
            n++;
        } while (soma < num);
        System.out.println("O menor número foi o " + menorAlgarismo);
    }
}
