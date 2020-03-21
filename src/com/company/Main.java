package com.company;

import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here


        DigitalHouseManager nuevoManager = new DigitalHouseManager();
        nuevoManager.altaCurso("Matematica", 8756, 7);
        //nuevoManager.bajaCurso(8756);
        nuevoManager.altaCurso("Fisica", 8796, 1);
        nuevoManager.altaCurso("Quimica", 8706, 7);


        nuevoManager.altaProfesorAdjunto("Tomas", "Contreras", 3819, 2);
        nuevoManager.altaProfesorTitular("Pedro", "Fatti", 4370, "Fisica cuantica");
        //System.out.println("" + nuevoManager.getListaDeProfesores());
        //nuevoManager.bajaProfesor(3819);
        //System.out.println("" + nuevoManager.getListaDeProfesores());
        nuevoManager.altaAlumno("Theo", "Musumeci", 55117);
        nuevoManager.altaAlumno("Juan", "Perez", 55115);
        nuevoManager.inscribirAlumno(55115, 8796);
        nuevoManager.inscribirAlumno(55117, 8796);
nuevoManager.asignarProfesores(8796,4370,3819);

    }
}
