public class Bloco3Ex16 {
    public static void main(String[] args) {

    }

    public static double salarioLiquidoProcessamento(double salarioBruto){
        double salarioLiq;
        if (Double.isNaN(salarioBruto)){
            throw new IllegalArgumentException("Input Inválido");
        }
        if (salarioBruto <= 500){
            salarioLiq = salarioBruto * 0.9;
        } else
            if (salarioBruto <= 1000){
                salarioLiq = salarioBruto * 0.85;
            } else {
                salarioLiq = salarioBruto * 0.8;
            }
        return salarioLiq;
    }
}
