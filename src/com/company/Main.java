package com.company;

import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager nuevoManager = new DigitalHouseManager();

        //Creo los profesores

        nuevoManager.altaProfesorAdjunto("Tomas", "Contreras", 3819, 2);
        nuevoManager.altaProfesorAdjunto("Jose", "Verdini", 4178, 5);
        nuevoManager.altaProfesorTitular("Pedro", "Fatti", 4370, "Redes sociales");
        nuevoManager.altaProfesorTitular("Chester", "Gonzalez", 1856, "Diseño de paginas web");

        //Creo los cursos

        nuevoManager.altaCurso("Full Stack", 20001, 3);
        nuevoManager.altaCurso("Android", 20002, 2);

        //Asigo profesores a los cursos

        nuevoManager.asignarProfesores(20001, 1856, 4178);
        nuevoManager.asignarProfesores(20002, 4370, 3819);

        //Doy de alta 3 alumnos

        nuevoManager.altaAlumno("Theo", "Musumeci", 113);
        nuevoManager.altaAlumno("Juan", "Perez", 365);
        nuevoManager.altaAlumno("Tomas", "Nuñez", 867);

        //Inscribo 2 alumnos en el curso Full Stack

        nuevoManager.inscribirAlumno(113, 20001);
        nuevoManager.inscribirAlumno(867, 20001);

        //Inscribo 3 alumnos al curso Android

        nuevoManager.inscribirAlumno(113, 20002);
        nuevoManager.inscribirAlumno(867, 20002);
        nuevoManager.inscribirAlumno(365, 20002);

        //Doy de baja un profesor

        nuevoManager.bajaProfesor(4178);

        //Doy de baja un curso

        nuevoManager.bajaCurso(20002);

    }
}


/**
 * Parte K.
 * Para que el alumno sepa a que curso esta incripto, se podria agregar un atributo List<Inscripcion> listaInscripcionesAlumno a la clase Alumno, y un metodo que consulte la lista y devuelva que inscripciones
 * tiene hechas ese alumno.
 * Tambien habria que definir un metodo para que el alumno pueda agregar o quitar una inscripcion a su lista.
 * En el diagrama de clases habria que agregar una flecha de "tiene" (solida y rellena) desde la clase Alumno hasta la clase Inscripcion.
 */