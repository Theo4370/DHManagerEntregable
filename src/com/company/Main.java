package com.company;

import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Alumno unAlumno = new Alumno("Theo", "Musumeci", 55117);
        Alumno otroAlumno = new Alumno("Juan", "Perez", 55115);


        DigitalHouseManager nuevoManager = new DigitalHouseManager();
        nuevoManager.altaCurso("Matematica", 8756, 7);
        //nuevoManager.bajaCurso(8756);
        nuevoManager.altaCurso("Fisica", 8796, 7);
        nuevoManager.altaCurso("Quimica", 8706, 7);
        
/**
        Curso curso = new Curso("clase", 4758, 1);
        curso.agregarUnAlumno(unAlumno);
        curso.agregarUnAlumno(otroAlumno);
        System.out.println(""+curso.getListaDeAlumnos());
        curso.eliminarAlumno(unAlumno);
        System.out.println(""+curso.getListaDeAlumnos());
   */
    }
}
