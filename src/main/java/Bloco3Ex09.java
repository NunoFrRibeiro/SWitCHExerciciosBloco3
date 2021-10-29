import java.util.Scanner;

public class Bloco3Ex09 {
    public static void main(String[] args){
        calculoSalarios();
    }

    public static void calculoSalarios(){
        int contador = 0;
        double contador2 = 0;
        int horas;
        double salarioFinal;
        do {
            Scanner ler = new Scanner(System.in);
            System.out.println("Quantas horas extra fez o trabalhador?");
            horas = ler.nextInt();
            if (horas == -1){
                break;
            }
            System.out.println("Qual é o salário do trabalhador");
            int salario = ler.nextInt();
            salarioFinal = salario + (salario * 0.02 * horas);
            contador2 += salarioFinal;
            contador++;
            System.out.println("o salário do trabalhador ao fim do mês será: " + salarioFinal);
        } while (horas > -1);
        System.out.println("A média de salarários é: " + (contador2 / contador));
    }
}
