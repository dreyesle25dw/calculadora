
package com.zubiri;

import java.util.Objects;

/**
 * Representa a un alumno.
 */
public class Alumno {

    private String id;
    private String nombre;
    private boolean activo;
    private int[] notas;

    /**
     * Construye un alumno.
     *
     * @param id identificador del alumno
     * @param nombre nombre del alumno
     * @param activo estado del alumno
     * @param notas notas del alumno
     */
    public Alumno(final String id, final String nombre,
            final boolean activo, final int[] notas) {
        this.id = id;
        setNombre(nombre);
        this.activo = activo;
        this.notas = notas;
    }

    /**
     * Modifica el nombre del alumno.
     *
     * @param nombre nuevo nombre
     */
    public final void setNombre(final String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException(
                    "El nombre no puede ser nulo (null)");
        }
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador.
     *
     * @return identificador
     */
    public final String getId() {
        return id;
    }

    /**
     * Comprueba si el alumno está activo.
     *
     * @return estado del alumno
     */
    public final boolean isActivo() {
        return activo;
    }

    /**
     * Obtiene las notas del alumno.
     *
     * @return array de notas
     */
    public final int[] getNotas() {
        return notas;
    }

    /**
     * Compara dos alumnos por su identificador.
     *
     * @param obj objeto que se desea comparar
     * @return true si tienen el mismo identificador
     */
    @Override
    public final boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Alumno alumno = (Alumno) obj;
        return Objects.equals(id, alumno.id);
    }

    /**
     * Calcula el código hash del alumno.
     *
     * @return código hash
     */
    @Override
    public final int hashCode() {
        return Objects.hash(id);
    }
}