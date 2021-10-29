public class Bloco3Ex01 {
    public static String lerNumProcessamento(int numero){
        int resultado = 1;
        String resultadoFinal = "";
        int x;
        if (numero <= 1){
            resultadoFinal = "Número inválido";
        } else {
            for (x = numero; x >= 1; x--){
                resultado = resultado * x;
                resultadoFinal = "O resultado é : " + resultado;
            }
        }
        return resultadoFinal;
    }
}
