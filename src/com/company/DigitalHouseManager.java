package com.company;

import com.company.Profesor.Profesor;

import java.util.ArrayList;
import java.util.List;

/**
 * Ni constructor, ni getters ni setters fueron creados ya que la parte G no lo pide.
 */

public class DigitalHouseManager {
    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Inscripcion> listaDeInscripciones;
    //Para poder agregar cursos, necesito que listaDeCursos sea un new ArrayList() (si no me devolveria null)
    private List<Curso> listaDeCursos = new ArrayList<>();


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
}
