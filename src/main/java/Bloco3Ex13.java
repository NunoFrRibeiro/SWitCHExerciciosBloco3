import java.util.Scanner;

public class Bloco3Ex13 {
    public static void main(String[] args) {
        codigoProduto();
    }

    public static void codigoProduto(){
        Scanner ler = new Scanner(System.in);
        int codigo;
        int n = 1;

        do {
            System.out.println("Qual é o código do produto " + n);
            codigo = ler.nextInt();
            if (codigo == 1){
                System.out.println("Produto não perecível.");
            } else
                if (codigo >= 2 && codigo <= 4){
                    System.out.println("Alimento Perecível.");
                } else
                    if (codigo >= 5 && codigo <= 6) {
                        System.out.println("Vestuário");
                    } else
                        if (codigo == 7){
                            System.out.println("Higiene Pessoal");
                        } else
                            if (codigo >= 8 && codigo <= 15){
                                System.out.println("Limpeza e utênsílios domésticos.");
                            } else
                                System.out.println("Código inválido");
                            n++;
        } while (codigo != 0);
    }
}
