import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco3Ex16Test {

    @Test
    void salarioLiquidoTesteAceite1(){
        double expected = 450;
        double result = Bloco3Ex16.salarioLiquidoProcessamento(500);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void salarioLiquidoTesteAceite2(){
        double expected = 850;
        double result = Bloco3Ex16.salarioLiquidoProcessamento(1000);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void salarioLiquiTesteAceite3(){
        double expected = 800.8000000000001;
        double result = Bloco3Ex16.salarioLiquidoProcessamento(1001);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void salarioLiquidoTesteRejeitado1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Bloco3Ex16.salarioLiquidoProcessamento(Double.parseDouble("a"));
        });
    }
}