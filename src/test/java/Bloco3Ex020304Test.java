import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco3Ex020304Test {
    @Test
    public void exercicio4ATeste1(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4A(10,5);
        });
    }

    @Test
    public void exercicio4ATeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4A(5,5);
        });
    }

    @Test
    public void exercicio4ATeste3(){
        int expected = 5;
        int result = Bloco3Ex020304.exercicio4A(1,16);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void exercicio4BTeste1(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4B(10,5,5);
        });
    }

    @Test
    public void exercicio4BTeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4B(5,5,5);
        });
    }

    @Test
    public void exercicio4BTeste3(){
        int expected = 3;
        int result = Bloco3Ex020304.exercicio4B(1,16, 5);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void exercicio4CTeste1(){
        int expected = 7;
        int result = Bloco3Ex020304.exercicio4C(1,16);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void exercicio4CTeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4C(19,5);
        });
    }

    @Test
    public void exercicio4CTeste3(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4C(19,19);
        });
    }

    @Test
    public void exercicio4DTeste1(){
        int expected = 10;
        int result = Bloco3Ex020304.exercicio4D(1,16,2,3);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void exercicio4DTeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4D(19,19, 2,4);
        });
    }

    @Test
    public void exercicio4DTeste3(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4D(19,1, 2,4);
        });
    }

    @Test
    public void exercicio4ETeste1(){
        int expected = 76;
        int result = Bloco3Ex020304.exercicio4E(1,16,2,5);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void exercicio4ETeste2(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4E(19,1, 2,4);
        });
    }

    @Test
    public void exercicio4ETeste3(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Bloco3Ex020304.exercicio4E(19,19, 2,4);
        });
    }
}