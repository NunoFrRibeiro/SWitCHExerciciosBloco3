import javax.script.ScriptContext;
import java.util.Scanner;

public class Bloco3Ex17 {
    public static void main(String[] args) {
        verificacaoCao();
    }

    public static void verificacaoCao(){
        Scanner read = new Scanner(System.in);
        double peso;
        double racao;
        do {
            System.out.println("Qual é o peso do cão?");
            peso = read.nextDouble();
            if (peso > 0) {
                System.out.println("Qual é a quantidade de ração dada?");
                racao = read.nextDouble();
                System.out.println(pesoRacaoCao(peso, racao));
            }
        } while (peso > 0);

    }

    public static String pesoRacaoCao(double peso, double racao) {
        String resultado = "";
        if (peso <= 10 && peso > 0) {
            if (racao > 100) {
                resultado = "O cão é de raça Pequena e a quantidade de ração é superior ao recomendado";
            } else {
                resultado = "O cão é de raça Pequena e a quantidade de ração está dentro da recomendada";
            }
        } else if (peso <= 25) {
            if (racao > 250) {
                resultado = "O cão é de raça Média e a quantidade de ração é superior ao recomendado";
            } else {
                resultado = "O cão é de raça Média e a quantidade de ração está dentro da recomendada";
            }
        }else if(peso <= 45) {
            if (racao > 300){
                    resultado = "O cão é de raça Grande e a quantidade de ração é superior ao recomendado";
                } else {
                    resultado = "O cão é de raça Grande e a quantidade de ração está dentro da recomendada";
                }
        } else if (peso > 45) {
            if (racao > 500) {
                    resultado = "O cão é de raça Gigante e a quantidade de ração é superior ao recomendado";
                } else {
                    resultado = "O cão é de raça Gigante e a quantidade de ração está dentro da recomendada";
                }
        }
        return resultado;
    }

}
