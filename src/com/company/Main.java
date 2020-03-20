package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Alumno unAlumno = new Alumno("Theo", "Musumeci", 55117);
        Alumno otroAlumno = new Alumno("Juan", "Perez", 55115);
        System.out.println("" + otroAlumno.equals(unAlumno));

        Curso unCurso = new Curso("Mamtematica", 1589);
        Curso otroCurso = new Curso("Historia", 1589);
        System.out.println("" + otroCurso.equals(unCurso));

        Profesor unProfesor = new ProfesorTitular("Domingo", "Faustino", 30, 6871,"Fisico cuantico");
        Profesor otroProfesor = new ProfesorAdjunto("Jose", "Fernandez", 27, 6871,6);
        System.out.println("" + otroProfesor.equals(unProfesor));
    }
}
