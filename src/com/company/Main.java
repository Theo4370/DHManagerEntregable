package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Alumno unAlumno = new Alumno("Theo", "Musumeci", 55115);
        Alumno otroAlumno = new Alumno("Juan", "Perez", 55118);
        otroAlumno.equals(unAlumno);
        System.out.println("" + otroAlumno.equals(unAlumno));
    }
}
