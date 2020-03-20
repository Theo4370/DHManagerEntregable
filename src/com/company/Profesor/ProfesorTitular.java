package com.company.Profesor;

public class ProfesorTitular extends Profesor {
    private String especialidad;
    /**
     * Item I, item 3.
     * Para poder dar de alta un profesor titular, solo necesito los parámetros nombre, apellido, codigoDeProfesor y especialidad, entonces elimino el resto de los parámetros del constructor.
     */

    public ProfesorTitular(String nombre, String apellido, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, codigoDeProfesor);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


}
