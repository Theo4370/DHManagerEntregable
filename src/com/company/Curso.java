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


    public Curso(String nombreDelCurso, Integer codigoDeCurso, ProfesorTitular profesorTitular, ProfesorAdjunto profesorAdjunto, Integer cupoMaximoDeAlumnos, List<Alumno> listaDeALumnos) {
        this.nombreDeCurso = nombreDelCurso;
        this.codigoDeCurso = codigoDeCurso;
        this.profesorTitular = profesorTitular;
        this.profesorAdjunto = profesorAdjunto;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
        this.listaDeAlumnos = listaDeALumnos;
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


    public boolean agregarUnAlumno(Alumno unAlumno) {
        if (this.cupoMaximoDeAlumnos >= listaDeAlumnos.size()) ;
        this.listaDeAlumnos.add(unAlumno);
        return true;
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
