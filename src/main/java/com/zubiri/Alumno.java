
package com.zubiri;

import java.util.Objects;

/**
 * Representa a un alumno.
 */
public class Alumno {

    /** Identificador del alumno. */
    private String id;

    /** Nombre del alumno. */
    private String nombre;

    /** Estado del alumno. */
    private boolean activo;

    /** Notas del alumno. */
    private int[] notas;

    /**
     * Construye un alumno.
     *
     * @param nuevoId identificador del alumno
     * @param nuevoNombre nombre del alumno
     * @param estadoActivo estado del alumno
     * @param nuevasNotas notas del alumno
     */
    public Alumno(final String nuevoId, final String nuevoNombre,
            final boolean estadoActivo, final int[] nuevasNotas) {
        this.id = nuevoId;
        setNombre(nuevoNombre);
        this.activo = estadoActivo;
        this.notas = nuevasNotas;
    }

    /**
     * Modifica el nombre del alumno.
     *
     * @param nuevoNombre nuevo nombre
     */
    public final void setNombre(final String nuevoNombre) {
        if (nuevoNombre == null) {
            throw new IllegalArgumentException(
                    "El nombre no puede ser nulo (null)");
        }
        this.nombre = nuevoNombre;
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
