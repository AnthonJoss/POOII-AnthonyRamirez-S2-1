package pe.edu.usil.pooii.proyecto1.Model;

public class Curso {
    private String nombre;
    private int nota;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
