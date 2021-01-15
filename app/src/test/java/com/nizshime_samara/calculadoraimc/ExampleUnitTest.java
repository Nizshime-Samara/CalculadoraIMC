package com.nizshime_samara.calculadoraimc;

import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host)
 * Comentando durante aprendizado, adicionado aprendendo2
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    DecimalFormat resultado = new DecimalFormat("00.00");
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void sumTest(){
        double peso = 50.0;
        double altura = 1.80;
        double resultado = 50/(1.80*1.80);

        assertEquals(15.43,resultado,resultado);

        assertEquals("Extrema magreza",15.43,resultado,resultado);

        assertTrue("Extrema magreza",resultado <= 16.99);
    }


}

