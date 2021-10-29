public class Bloco3Ex05 {
    public static int exercicio5A(int limitInf, int limitSup){
        int result = 0;
        int x = limitInf;
        if (limitInf > limitSup){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do {
            if (ePar(x)) {
                result += x;
            }
            x++;
        } while (limitSup >= x);
        return result;
    }

    public static boolean ePar(int n){
        int result = 0;
        if ((n % 2) == 0){
            return true;
        } else {
            return false;
        }
    }

    public static int exercicio5B (int limInf, int limSup){
        int counter = 0;
        if (limInf >= limSup){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do{
            if (ePar(limInf)){
                counter++;
            }
            limInf++;
        } while (limInf < limSup);
        return counter;
    }

    public static int exercicio5C (int limInf, int limSup){
        int counter = 0;
        if (limInf >= limSup){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do{
           if (!ePar(limInf)) {
               counter += limInf;
           }
           limInf++;
        } while (limInf < limSup);
        return counter;
    }

    public static int exercicio5D (int limInf, int limSup){
        int counter = 0;
        if (limInf >= limSup){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do{
            if (!ePar(limInf)) {
                counter ++;
            }
            limInf++;
        } while (limInf < limSup);
        return counter;
    }

    public static int exercicio5E (int limA, int limB, int num){
        int soma = 0;
        if (limA == limB){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        if (limA < limB) {
            do {
                if ((limA % num) == 0) {
                    soma +=limA;
                }
                limA++;
                } while (limA < limB);
        } else {
                do {
                    if ((limB % num) == 0) {
                        soma += limB;
                    }
                    limB++;
                    } while (limB < limA);
                }
        return soma;
    }

    public static int exercicio5F (int limInf, int limSup,int num) {
        int produto = 1;
        if (limInf >= limSup){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        do {
            if ((limInf % num) == 0){
                produto *= limInf;
            }
            limInf++;
        } while (limInf < limSup);
        return produto;
    }

    public static int exercicio5G (int limInf, int limSup, int num){
        int produto = 1;
        int contador = 0;
        if (limInf >= limSup){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        if ((limInf % num) == 0) {
            do {
                produto *= limInf;
                contador++;
                limInf++;
            } while (limInf < limSup);
        }

        return (produto / contador);
    }

    public static int exercicio5H (int limA, int limB, int numX, int numY){
        int produto = 1;
        int contador = 0;
        if (limA == limB){
            throw new IllegalArgumentException("Limites incorrectos");
        }
        if (limA < limB){
            do {
                if ((limA % numX) == 0){
                    produto *= limA;
                    contador++;
                    } else
                        if ((limA % numY) == 0){
                            produto *= limA;
                            contador++;
                        }
                limA++;
            } while (limA < limB);
        } else {
            do {
                if ((limB % numX) == 0){
                    produto *= limB;
                    contador++;
                } else
                    if ((limB % numY) == 0){
                        produto *= limB;
                        contador++;
                    }
                limB++;
            } while (limB < limA);
        }
        return (produto / contador);
    }
}
