public class Bloco3Ex06 {
    public static int exercicio6A(int numLongo){
        int counter = 0;
        int resto = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            resto = (resto * 10) + (numLongo % 10);
            numLongo = numLongo / 10;
            counter++;
        } while (numLongo != 0);
        return counter;
    }

    public static int exercicio6B(int numLongo){
        int counter = 0;
        int resto = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            //resto = (resto * 10) + (numLongo % 10);
            resto = numLongo % 10;
            numLongo = numLongo / 10;
            if (resto % 2 == 0){
                counter ++;
            }
        } while (numLongo != 0);
        return counter;
    }

    public static int exercicio6C(int numLongo){
        int counter = 0;
        int resto = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            //resto = (resto * 10) + (numLongo % 10);
            resto = numLongo % 10;
            numLongo = numLongo / 10;
            if (resto % 2 != 0){
                counter ++;
            }
        } while (numLongo != 0);
        return counter;
    }

    public static int exercicio6D(int numLongo){
        int counter = 0;
        int resto = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            resto = numLongo % 10;
            numLongo = numLongo / 10;
            counter += resto;
        } while (numLongo != 0);
        return counter;
    }

    public static int exercicio6E(int numLongo){
        int counter = 0;
        int resto = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            //resto = (resto * 10) + (numLongo % 10);
            resto = numLongo % 10;
            numLongo = numLongo / 10;
            if (resto % 2 == 0){
                counter += resto;
            }
        } while (numLongo != 0);
        return counter;
    }

    public static int exercicio6F(int numLongo){
        int counter = 0;
        int resto = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            //resto = (resto * 10) + (numLongo % 10);
            resto = numLongo % 10;
            numLongo = numLongo / 10;
            if (resto % 2 != 0){
                counter += resto;
            }
        } while (numLongo != 0);
        return counter;
    }

    public static double exercicio6G(int numLongo){
        int counter = 0;
        int resto;
        int i = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            resto = numLongo % 10;
            numLongo = numLongo / 10;
            counter += resto;
            i ++;
        } while (numLongo != 0);
        return (counter * 1.0 / i);
    }

    public static double exercicio6H(int numLongo){
        int counter = 0;
        int resto = 0;
        int i = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            resto = numLongo % 10;
            numLongo = numLongo / 10;
            if (resto % 2 == 0){
                counter += resto;
                i++;
            }
        } while (numLongo != 0);
        return (counter * 1.0 / i);
    }

    public static double exercicio6I(int numLongo){
        int counter = 0;
        int resto = 0;
        int i = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            resto = numLongo % 10;
            numLongo = numLongo / 10;
            if (resto % 2 != 0){
                counter += resto;
                i++;
            }
        } while (numLongo != 0);
        return (counter * 1.0 / i);
    }

    public static int exercicio6J(int numLongo){
        int resto = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            resto = (resto * 10) + (numLongo % 10);
            numLongo = numLongo / 10;
        } while (numLongo != 0);
        return resto;
    }

    public static long exercicio6A2(long numLongo){
        int counter = 0;
        long resto = 0;
        if (numLongo < 100){
            throw new IllegalArgumentException("Inteiro Inválido");
        }
        do {
            resto = (resto * 10) + (numLongo % 10);
            numLongo = numLongo / 10;
            counter++;
        } while (numLongo != 0);
        return counter;
    }
}
