package com.company;

import com.company.Profesor.Profesor;
import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

/**
 * Ni constructor, ni getters ni setters fueron creados ya que la parte G no lo pide.
 */

public class DigitalHouseManager {
    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores = new ArrayList<>();
    private List<Inscripcion> listaDeInscripciones;
    //Para poder agregar cursos, necesito que listaDeCursos sea un new ArrayList() (si no me devolveria null)
    private List<Curso> listaDeCursos = new ArrayList<>();

    public List<Profesor> getListaDeProfesores() {
        return listaDeProfesores;
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDeAlumnos) {
        Curso unCurso = new Curso(nombre, codigoCurso, cupoMaximoDeAlumnos);
        this.listaDeCursos.add(unCurso);

    }

    public void bajaCurso(Integer codigoCurso) {
        Curso cursoAEliminar = null;
        for (Curso curso : listaDeCursos) {
            if (codigoCurso.equals(curso.getCodigoDeCurso())) {
                cursoAEliminar = curso;
                break;
            }
        }
        this.listaDeCursos.remove(cursoAEliminar);
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        ProfesorAdjunto profesorAdjunto = new ProfesorAdjunto(nombre, apellido, codigoProfesor, cantidadDeHoras);
        this.listaDeProfesores.add(profesorAdjunto);

    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        ProfesorTitular profesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        this.listaDeProfesores.add(profesorTitular);
    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesorBaja = null;
        for (Profesor profesor : listaDeProfesores) {
            if (codigoProfesor.equals(profesor.getCodigoDeProfesor())) {
                profesorBaja = profesor;
                break;
            }
        }
        this.listaDeProfesores.remove(profesorBaja);
    }
}
