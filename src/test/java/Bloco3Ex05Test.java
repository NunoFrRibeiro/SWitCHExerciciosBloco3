import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco3Ex05Test {
    @Test
    public void somaParesNoIntervaloTeste1(){
        int expected = 24;
        int result = Bloco3Ex05.exercicio5A(5,10);
        assertEquals(expected,result);
    }

    @Test
    public void somaParesNoIntervaloTeste2(){
        int expected = -24;
        int result = Bloco3Ex05.exercicio5A(-10,-5);
        assertEquals(expected,result);
    }

    @Test
    public void somaParesNoIntervaloTeste3(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5A(10,5);
        });
    }

    @Test
    public void somaParesNoIntervaloTeste4(){
        int expected = 14;
        int result = Bloco3Ex05.exercicio5A(-13,15);
        assertEquals(expected,result);
    }

    @Test
    public void somaParesNoIntervaloTeste5(){
        int expected = 8;
        int result = Bloco3Ex05.exercicio5A(8,8);
        assertEquals(expected,result);
    }

    @Test
    public void somaParesNoIntervaloTeste6(){
        int expected = 0;
        int result = Bloco3Ex05.exercicio5A(7,7);
        assertEquals(expected,result);
    }

    @Test
    public void somaParesNoIntervaloTeste7(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5A(15,-13);
        });
    }

    @Test
    public void exercicio5BTeste1(){
        int expected = 4;
        int result = Bloco3Ex05.exercicio5B(1,10);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void exercicio5BTeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5B(10,5);
        });
    }

    @Test
    public void exercicio5BTeste3(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5B(5,5);
        });
    }

    @Test
    public void  exercicio5CTeste1(){
        int expected = 25;
        int result = Bloco3Ex05.exercicio5C(1,10);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void exercicioCTeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5C(10,5);
        });
    }

    @Test
    public void exercicio5CTeste3(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5C(5,5);
        });
    }

    @Test
    public void exercicio5DTeste1(){
        int expected = 5;
        int result = Bloco3Ex05.exercicio5D(1,10);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void exercicio5DTeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5D(10,5);
        });
    }

    @Test
    public void exercicio5DTeste3(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5D(5,5);
        });
    }

    @Test
    public void exercicio5ETeste1(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5E(5,5, 5);
        });
    }

    @Test
    public void exercicio5ETeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex05.exercicio5E(10,5, 5);
        });
    }

    @Test
    public void exercicio5ETeste3(){
        int expected = 15;
        int result = Bloco3Ex05.exercicio5E(1,15,5);
        Assertions.assertEquals(expected,result);
    }
}