package pe.edu.usil.pooii.proyecto1.Model;

import java.util.Random;

public class Docente extends Persona{
    private String cursoDocente;
    private String facultadDocente;

    public Docente(String cursoDocente, String facultadDocente) {
        this.cursoDocente = cursoDocente;
        this.facultadDocente = facultadDocente;
    }

    public String getCursoDocente() {
        return cursoDocente;
    }

    public void setCursoDocente(String cursoDocente) {
        this.cursoDocente = cursoDocente;
    }

    public String getFacultadDocente() {
        return facultadDocente;
    }

    public void setFacultadDocente(String facultadDocente) {
        this.facultadDocente = facultadDocente;
    }

    public void calificarCurso(Curso curso){
        Random random = new Random();
        int nota = random.nextInt(21);

        curso.setNota(nota);
    }
}
