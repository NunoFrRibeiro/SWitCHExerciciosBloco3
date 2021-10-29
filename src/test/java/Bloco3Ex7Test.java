import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Bloco3Ex7Test {
    @Test
    void verificacaoCapucuaTeste(){
        boolean expected = true;
        boolean result = Bloco3Ex7.verificacaoCapicua(151);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoNumAmstrongTeste1(){
        boolean expected = true;
        boolean result = Bloco3Ex7.verificacaoNumAmstrong(153);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoNumAmstrongTeste2(){
        boolean expected = false;
        boolean result = Bloco3Ex7.verificacaoNumAmstrong(154);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoNumAmstrongTeste3(){
        boolean expected = true;
        boolean result = Bloco3Ex7.verificacaoNumAmstrong(370);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exercicio7CTeste1(){
        int expected = 505;
        int result = Bloco3Ex7.exercicio7C(499,516);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exercicio7DTeste1(){
        int expected = 515;
        int result = Bloco3Ex7.exercicio7D(499,516);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exercicio7ETeste1(){
        int expected = 55;
        int result = Bloco3Ex7.exercicio7E(499,1500);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exercicio7FTeste1(){
        int expected = 153;
        int result = Bloco3Ex7.exercicio7F(10,1000);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exericio7GTeste1(){
        int expected = 4;
        int result = Bloco3Ex7.exercicio7G(100, 1000);
        Assertions.assertEquals(expected, result);
    }
}
