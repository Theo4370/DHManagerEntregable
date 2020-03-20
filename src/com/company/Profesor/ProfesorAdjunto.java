package com.company.Profesor;

public class ProfesorAdjunto extends Profesor {
    private Integer horasDeConsulta;

    /**
     * Item I, item 3.
     * Para poder dar de alta un profesor adjunto, solo necesito los parámetros nombre, apellido, codigoDeProfesor y horasDeConsulta, entonces elimino el resto de los parámetros del constructor.
     */

    public ProfesorAdjunto(String nombre, String apellido, Integer codigoDeProfesor, Integer horasDeConsulta) {
        super(nombre, apellido, codigoDeProfesor);
        this.horasDeConsulta = horasDeConsulta;
    }

    public Integer getHorasDeConsulta() {
        return horasDeConsulta;
    }

    public void setHorasDeConsulta(Integer horasDeConsulta) {
        this.horasDeConsulta = horasDeConsulta;
    }


}
