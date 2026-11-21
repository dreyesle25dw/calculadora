
package com.zubiri;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Prueba las operaciones de la calculadora.
 */
public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void sumaTest() {
        int resultado = calc.suma(2, 3);
        assertEquals(5, resultado,
                "La suma de 2 + 3 debería ser 5");
    }

    @Test
    public void restaTest() {
        int resultado = calc.resta(10, 4);
        assertEquals(6, resultado,
                "La resta 10 - 4 debería ser 6");
    }

    @Test
    public void multiplicacionTest() {
        int resultado = calc.multiplicacion(5, 5);
        assertEquals(25, resultado,
                "La multiplicación de 5 * 5 debería ser 25");
    }
}