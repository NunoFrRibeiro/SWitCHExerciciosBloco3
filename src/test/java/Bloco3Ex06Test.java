import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Bloco3Ex06Test {

    @Test
    void exercicio6ATeste1(){
        int expected = 4;
        int result = Bloco3Ex06.exercicio6A(4567);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void exercicio6ATeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Bloco3Ex06.exercicio6A(45);
        });
    }

    @Test
    void exercicio6ATeste3(){
        Assertions.assertThrows(IllegalArgumentException. class, ()-> {
            Bloco3Ex06.exercicio6A(99);
                });
    }

    @Test
    void exercicio6BTeste1(){
        int expected = 2;
        int result = Bloco3Ex06.exercicio6B(4567);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void exercicio6CTeste1(){
        int expected = 2;
        int result = Bloco3Ex06.exercicio6C(4567);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void exercicio6DTeste1(){
        int expected = 22;
        int result = Bloco3Ex06.exercicio6D(4567);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exercicio6ETeste1(){
        int expected = 10;
        int result = Bloco3Ex06.exercicio6E(4567);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exercicio6FTeste1(){
        int expected = 12;
        int result = Bloco3Ex06.exercicio6F(4567);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void exercicio6GTeste1(){
        double expected = 5.5;
        double result = Bloco3Ex06.exercicio6G(4567);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exercicio6HTeste1(){
        double expected = 5.0;
        double result =  Bloco3Ex06.exercicio6H(4567);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void exercicio6ITeste1(){
        double expected = 6.0;
        double result = Bloco3Ex06.exercicio6I(4567);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exercicio6JTeste1(){
        int expected = 987;
        int result = Bloco3Ex06.exercicio6J(789);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void exercicio6A2Teste1(){
        long expected = 10;
        long result = Bloco3Ex06.exercicio6A2(1234567891L);
        Assertions.assertEquals(expected, result);
    }

}