public class Bloco3Ex7 {
    public static boolean verificacaoCapicua(int num){
        int resto = num                ;
        int capicua= 0;
        boolean resultado;
        do {
            capicua = (capicua * 10) + (num % 10);
            num = num / 10;
        } while (num != 0);
        if (capicua == resto){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public static boolean verificacaoNumAmstrong(int num){
        int resto = num;
        int digito;
        double numAmstrong = 0;
        boolean resultado;
        do {
            digito = num % 10;
            numAmstrong = numAmstrong + Math.pow(digito, 3);
            num = num / 10;
        } while (num != 0);
        if (numAmstrong == resto){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public static int exercicio7C(int limA, int limB){
        int resultado = 0;
        int capicua = 0;
        if (limA > limB){
            throw new IllegalArgumentException("Limites incorrectos");
        }

        do {
            if (verificacaoCapicua(limA)){
                resultado = limA;
                break;
            }
            limA++;
        } while (limA < limB);
        return resultado;
    }

    public static int exercicio7D(int limA, int limB){
        int maiorCapicua = 0;
        if (limA > limB){
            throw new IllegalArgumentException("Limites incorrectos");
        }

        do {
            if (verificacaoCapicua(limA)){
                if (limA > maiorCapicua){
                    maiorCapicua = limA;
                }
            }
            limA++;
        } while (limA < limB);
        return maiorCapicua;
    }

    public static int exercicio7E(int limA, int limB){
        int i = 0;
        if (limA > limB){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do {
            if (verificacaoCapicua(limA)){
                i++;
            }
            limA++;
        } while (limA < limB);
        return i;
    }

    public static int exercicio7F(int limA, int limB){
        int numAmstrong = 0;
        if (limA > limB){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do{
            if (verificacaoNumAmstrong(limA)){
                numAmstrong = limA;
                break;
            }
            limA++;
        } while (limA < limB);
        return numAmstrong;
    }

    public static int exercicio7G(int limA, int limB){
        int i = 0;
        if (limA > limB){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do{
            if (verificacaoNumAmstrong(limA)){
                i++;
            }
            limA++;
        } while (limA < limB);
        return i;
    }
}
