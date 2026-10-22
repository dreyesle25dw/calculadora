package com.zubiri;

import java.util.Objects;

public class Alumno {

    private String id;
    private String nombre;
    private boolean activo;
    private int[] notas;

    public Alumno(String id, String nombre, boolean activo, int[] notas) {
        this.id = id;
        setNombre(nombre); // Usamos el setter para pasar la validación
        this.activo = activo;
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo (null)");
        }
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public boolean isActivo() { return activo; }
    public int[] getNotas() { return notas; }

    // Imprescindible para comparar objetos:
    // Diremos que dos alumnos son IGUALES si tienen el mismo ID.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno alumno = (Alumno) obj;
        return Objects.equals(id, alumno.id);
    }
}

