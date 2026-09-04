package pe.edu.usil.pooii.proyecto1;

import pe.edu.usil.pooii.proyecto1.Model.Alumno;
import pe.edu.usil.pooii.proyecto1.Model.Curso;
import pe.edu.usil.pooii.proyecto1.Model.Docente;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Tarea 1 - Proyecto 1: plantilla lista.");

        List<Curso> cursos = new LinkedList<>();

        Alumno alumno = new Alumno("2020", cursos);
        List<Curso> cursosAlumno = alumno.getListaCursos();

        Docente docente = new Docente("Curso", "Ingenieria");

        for (Curso curso : cursosAlumno){
            docente.calificarCurso(curso);
            System.out.println("Nombre: " + curso.getNombre() + " Nota: " + curso.getNota());
        }

    }



}
