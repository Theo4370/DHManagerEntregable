package com.company.Profesor;

/**
 * Item 1, parte D.
 * Para agregar dos nuevas categorias de profesores, creo dos nuevas clases llamadas ProfesorTitular y ProfesorAdjunto, estas pasan a ser extensiones de la clase Profesor, tomando todos sus atributos y métodos.
 * La clase profesor pasa a ser abstracta, ya que nunca vamos a crear un objeto de clase Profesor, si no que siempre tendra que ser Titular o Adjunto.
 */

/**
 * Item 3 y 4, parte I.
 * Como en ambos casos la antiguedad inicial de todos los profesores es 0, pongo directamente este valor como fijo dentro del constructor usando static final ANTIGUEDAD_INICIAL.
 */
//Corrigo: el static final estaba mal dado que si no no podria aumentar la antiguedad de los profesores. Lo pongo como 0 directamente en el valor del constructor.

public abstract class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;


    public Profesor(String nombre, String apellido, Integer codigoDeProfesor, Integer antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }


    @Override
    public boolean equals(Object profesorAComparar) {
        if (!(profesorAComparar instanceof Profesor)) {
            return false;
        }

        Profesor otroProfesor = (Profesor) profesorAComparar;
        return otroProfesor.getCodigoDeProfesor().equals(this.codigoDeProfesor);

    }
}
