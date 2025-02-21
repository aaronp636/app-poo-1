package model;

public class Curso {

    private Integer idcurso;
    private String nomcursos;
    private Integer credcursos;
    private  Boolean estadocurso;

    public Curso(){

    }

    public  Curso(Integer idcurso){
        this.idcurso = idcurso;
    }
    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getNomcursos() {
        return nomcursos;
    }

    public void setNomcursos(String nomcursos) {
        this.nomcursos = nomcursos;
    }

    public Integer getCredcursos() {
        return credcursos;
    }

    public void setCredcursos(Integer credcursos) {
        this.credcursos = credcursos;
    }

    public Boolean getEstadocurso() {
        return estadocurso;
    }

    public void setEstadocurso(Boolean estadocurso) {
        this.estadocurso = estadocurso;
    }
}
