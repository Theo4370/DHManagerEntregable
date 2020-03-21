package com.company;

import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 1, parte E.
 * Ahora al curso se le agregan los atributos profesorTitular(ProfesorTitular), profesorAdjunto(ProfesorAdjunto), cupoMaximoDeAlumnos(Integer) y listaDeAlumnos(List<Alumno>)
 * Por ahora, a estos atributos tambien habra que pasarlos como parmaetros, asi que los agrego al constructor y tambien sumo sus getters y setters.
 */

public class Curso {
    private String nombreDeCurso;
    private Integer codigoDeCurso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listaDeAlumnos;

    /**
     * Parte I, items 1 y 2.
     * Para poder dar de alta un curso, solo necesito los parámetros nombreDelCurso, codigoDeCurso, cupoMaximoDeAlumnos, entonces elimino el resto de los parámetros del constructor.
     * Los this. de profesorTitular, profesorAdjunto y listaDeAlumnos las comento para no general conflictos.
     */

    public Curso(String nombreDelCurso, Integer codigoDeCurso, Integer cupoMaximoDeAlumnos) {
        this.nombreDeCurso = nombreDelCurso;
        this.codigoDeCurso = codigoDeCurso;
        //this.profesorTitular = profesorTitular;
        //this.profesorAdjunto = profesorAdjunto;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
        this.listaDeAlumnos = new ArrayList<>();
    }

    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public Integer getCupoMaximoDeAlumnos() {
        return cupoMaximoDeAlumnos;
    }

    public void setCupoMaximoDeAlumnos(Integer cupoMaximoDeAlumnos) {
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
    }

    public List<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public void setListaDeAlumnos(List<Alumno> listaDeAlumnos) {
        this.listaDeAlumnos = listaDeAlumnos;
    }

    public String getNombreDelCurso() {
        return nombreDeCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDeCurso = nombreDelCurso;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }


    /**
     * Parte I, item 7.
     * Tuve que modificar la función agregarUnAlumno, ya que la funcion inscribirAlumno en la clase DigitalHouseManager hacia la inscripcion aun cuando no habia cupos
     * Lo resolvi cambiando el return por false en agregarUnAlumno.
     */
    public boolean agregarUnAlumno(Alumno unAlumno) {
        if (this.cupoMaximoDeAlumnos > listaDeAlumnos.size()) {
            return listaDeAlumnos.add(unAlumno);

        } else {
            System.out.println("El alumno " + unAlumno.getNombre() + " no pudo inscribirse porque no hay mas cupos para el curso de "+getNombreDelCurso());
        }
        return false;
    }

    public void eliminarAlumno(Alumno unAlumno) {
        this.listaDeAlumnos.remove(unAlumno);
    }


    @Override
    public boolean equals(Object cursoAComparar) {
        if (!(cursoAComparar instanceof Curso)) {
            return false;
        }

        Curso otroCurso = (Curso) cursoAComparar;
        return otroCurso.getCodigoDeCurso().equals(this.codigoDeCurso);
    }
}

