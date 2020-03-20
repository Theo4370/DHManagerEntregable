package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Alumno unAlumno = new Alumno("Theo", "Musumeci", 55115);
        Alumno otroAlumno = new Alumno("Juan", "Perez", 55115);
        otroAlumno.equals(unAlumno);
        System.out.println("" + otroAlumno.equals(unAlumno));

        Curso unCurso = new Curso("Mamtematica",1589);
        Curso otroCurso = new Curso("Historia",1589);
        System.out.println(""+otroCurso.equals(unCurso));
        System.out.println(""+unCurso.equals(otroCurso));    }
}
