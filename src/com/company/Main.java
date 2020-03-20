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
        System.out.println("" + otroAlumno.equals(unAlumno));

        ProfesorTitular unProfesor = new ProfesorTitular("Domingo", "Faustino", 30, 6871,"Fisico cuantico");
        ProfesorAdjunto otroProfesor = new ProfesorAdjunto("Jose", "Fernandez", 27, 6871,6);
        System.out.println("" + otroProfesor.equals(unProfesor));
        List<Alumno> lista = new ArrayList<>();
        lista.add(unAlumno);
        lista.add(otroAlumno);

        Curso unCurso = new Curso("Matematica", 1589, unProfesor, otroProfesor, 4, lista);
        Curso otroCurso = new Curso("Historia", 1589, unProfesor, otroProfesor, 8, lista);
        System.out.println("" + otroCurso.equals(unCurso));

Inscripcion inscripcion = new Inscripcion(unAlumno,unCurso);

    }
}
