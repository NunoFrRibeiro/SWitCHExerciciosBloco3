import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco3Ex01Test {

    @Test
    void lerNumTeste1(){
        String expected = "O resultado é : 120";
        String result = Bloco3Ex01.lerNumProcessamento(5);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void lerNumTeste2(){
        String expected = "Número inválido";
        String result = Bloco3Ex01.lerNumProcessamento(0);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void lerNumTeste3(){
        String expected = "Número inválido";
        String result = Bloco3Ex01.lerNumProcessamento(1);
        //Assertions.assertEquals(expected,result);
    }
}