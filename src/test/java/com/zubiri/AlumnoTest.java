
package com.zubiri;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    void testEstadoDeObjeto_Null_NotNull_True_False() {
        Alumno alumno1 = new Alumno(
                "100", "Ane", true, new int[]{7, 8, 9});
        Alumno alumnoVacio = null;

        assertNotNull(alumno1,
                "El alumno debería haberse creado correctamente");
        assertNull(alumnoVacio, "El objeto debe ser null");

        assertTrue(alumno1.isActivo(),
                "El alumno debería estar activo");

        Alumno alumno2 = new Alumno(
                "101", "Jon", false, new int[]{5, 6});

        assertFalse(alumno2.isActivo(),
                "Este alumno no debería estar activo");
    }

    @Test
    void testComparacionObjetos_Equals_NotEquals() {
        Alumno alumnoA = new Alumno(
                "100", "Ane", true, new int[]{7, 8, 9});

        Alumno alumnoB = new Alumno(
                "100", "Ane M.", true, new int[]{7, 8, 9});

        Alumno alumnoC = new Alumno(
                "102", "Mikel", true, new int[]{5, 5, 5});

        assertEquals(alumnoA, alumnoB,
                "Los alumnos con el mismo ID son iguales para nuestro sistema");

        assertNotEquals(alumnoA, alumnoC,
                "Los alumnos con distinto ID no son iguales");
    }

    @Test
    void testComparacionArrays_ArrayEquals() {
        Alumno alumno1 = new Alumno(
                "100", "Ane", true, new int[]{7, 8, 9});

        int[] calificacionesEsperadas = {7, 8, 9};

        assertArrayEquals(calificacionesEsperadas, alumno1.getNotas(),
                "La lista de notas debe ser exactamente igual");
    }

    @Test
    void testExcepciones_Fail() {
        try {
            Alumno alumnoDefectuoso = new Alumno(
                    "103", null, true, new int[]{});

            fail("El test ha fallado: no ha lanzado la IllegalArgumentException esperada");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    void testInvalidData_Fail() {
        Alumno sinNombre = new Alumno(
                "201", "antonio", false, null);

        try {
            sinNombre.setNombre(null);
            fail("El test falla: no se ha capturado la excepción");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }
}