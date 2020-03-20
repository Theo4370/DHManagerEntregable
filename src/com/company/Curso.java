package com.company;

public class Curso {
    private String nombreDeCurso;
    private Integer codigoDeCurso;

    public Curso(String nombreDelCurso, Integer codigoDeCurso) {
        this.nombreDeCurso = nombreDelCurso;
        this.codigoDeCurso = codigoDeCurso;
    }

    public String getNombreDelCurso() {
        return nombreDeCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDeCurso = nombreDelCurso;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(Integer codigoDeCurso) {
        codigoDeCurso = codigoDeCurso;
    }

    @Override
    public boolean equals(Object cursoAComparar) {
        if (!(cursoAComparar instanceof Curso)) {
            return false;
        }

        Curso otroCurso = (Curso) cursoAComparar;
        return otroCurso.getCodigoDeCurso().equals(this.codigoDeCurso);
    }
}
