package com.company.Profesor;

public class ProfesorAdjunto extends Profesor {
    private Integer horasDeConsulta;


    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer horasDeConsulta) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.horasDeConsulta = horasDeConsulta;
    }

    public Integer getHorasDeConsulta() {
        return horasDeConsulta;
    }

    public void setHorasDeConsulta(Integer horasDeConsulta) {
        this.horasDeConsulta = horasDeConsulta;
    }


}
