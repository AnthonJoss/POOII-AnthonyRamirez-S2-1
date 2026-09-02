package pe.edu.usil.pooii.proyecto1.Model;

import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Alumno extends Persona{
    private String codigoAlumno;
    private List<Curso> listaCursos;

    public Alumno(String codigo, List<Curso> listaCursos){
        this.codigoAlumno = codigo;
        this.listaCursos = listaCursos;

        this.leeCursoAlumno("/cursosAlumnos.txt");
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public void leeCursoAlumno(String ruta){
        List<Curso> cursos = new LinkedList<>();

        InputStream entrada = getClass().getResourceAsStream(ruta);
        if (entrada == null) {
            System.out.println("No se encontro el recurso: " + ruta);
            return;
        }

        try (
            BufferedReader lector = new BufferedReader(
              new InputStreamReader(entrada, StandardCharsets.UTF_8)
            )
        ) {
            String linea;

            while((linea = lector.readLine()) != null){
                cursos.add(new Curso(linea));
            }
        } catch (IOException e){
            System.out.println("EERROR: " + e.getMessage());
        }

        for(Curso curso : cursos){
            System.out.println(curso.getNombre());
        }
        this.listaCursos = cursos;
    }
}
