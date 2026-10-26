package com.zubiri;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calc =  new Calculadora();

    @Test
     public void sumaTest(){
        int resultado = calc.suma(2,3);
        assertEquals(5, resultado, "La suma de 2 + 3 deberia ser 5");
     }
     
     @Test 
     public void restaTest(){
        int resultado = calc.resta(10,4);
        assertEquals(6,resultado, 
        "La resta 10 - 4 deberia ser 6");
     }

     @Test 
     public void multiplicacionTest(){
        int resultado = calc.multiplicacion(5,5);
        assertEquals(25,resultado,
        "la multiplicacion de 5 * 5 deberia ser 25");
     }
}