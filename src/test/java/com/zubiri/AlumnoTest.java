package com.zubiri;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    void testEstadoDeObjeto_Null_NotNull_True_False() {
        Alumno alumno1 = new Alumno("100", "Ane", true, new int[]{7, 8, 9});
        Alumno alumnoVacio = null;

        // assertNotNull / assertNull: Para comprobar si el objeto existe en memoria
        assertNotNull(alumno1, "El alumno debería haberse creado correctamente");
        assertNull(alumnoVacio, "El objeto debe ser null");

        // assertTrue / assertFalse: Para comprobar booleanos
        assertTrue(alumno1.isActivo(), "El alumno debería estar activo");

        Alumno alumno2 = new Alumno("101", "Jon", false, new int[]{5, 6});
        assertFalse(alumno2.isActivo(), "Este alumno no debería estar activo");
    }

    @Test
    void testComparacionObjetos_Equals_NotEquals() {
        Alumno alumnoA = new Alumno("100", "Ane", true, new int[]{7, 8, 9});
        // alumnoB tiene el mismo ID (100), aunque el nombre sea diferente
        Alumno alumnoB = new Alumno("100", "Ane M.", true, new int[]{7, 8, 9});
        Alumno alumnoC = new Alumno("102", "Mikel", true, new int[]{5, 5, 5});

        // assertEquals utiliza Object.equals() internamente.
        // Como tienen el mismo ID, el test lo dará por bueno.
        assertEquals(alumnoA, alumnoB, "Los alumnos con el mismo ID son iguales para nuestro sistema");

        // assertNotEquals
        assertNotEquals(alumnoA, alumnoC, "Los alumnos con distinto ID no son iguales");
    }

    @Test
    void testComparacionArrays_ArrayEquals() {
        Alumno alumno1 = new Alumno("100", "Ane", true, new int[]{7, 8, 9});
        int[] calificacionesEsperadas = {7, 8, 9};

        // Los arrays no se pueden comparar con assertEquals (porque compara referencias de memoria).
        // Se debe usar assertArrayEquals para comparar elemento por elemento.
        assertArrayEquals(calificacionesEsperadas, alumno1.getNotas(), "La lista de notas debe ser exactamente igual");
    }

    @Test
    void testExcepciones_Fail() {
        // Un uso clásico de 'fail()': cuando esperamos que ocurra un error.
        try {
            // Esto debería lanzar un IllegalArgumentException
            Alumno alumnoDefectuoso = new Alumno("103", null, true, new int[]{});
            // Si el código llega aquí, significa que no ha lanzado la excepción.
            // Por lo tanto, el test debe fallar intencionadamente usando fail().
            fail("El test ha fallado: no ha lanzado la IllegalArgumentException esperada (porque el nombre es null)");
        } catch (IllegalArgumentException e) {
            // Si la excepción se ha capturado correctamente, el test tendrá éxito
            assertNotNull(e.getMessage());
        }
    }

   @Test 
    void testInvalidData_Fail(){
        Alumno sinNombre = new Alumno("201", "antonio", false, null);
            
        try {
            sinNombre.setNombre(null);
            fail("El test falla : no se a capturado la excepcion");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }        
    }
}
