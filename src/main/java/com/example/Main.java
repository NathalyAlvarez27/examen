import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;

    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Estudiante{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}

class Escuela {
    private List<Estudiante> estudiantes;

    
    public Escuela() {
        this.estudiantes = new ArrayList<>();
    }

    
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    
    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    
    public static void main(String[] args) {
        Escuela escuela = new Escuela();

       
        Estudiante estudiante1 = new Estudiante("Nathaly", 26);
        Estudiante estudiante2 = new Estudiante("Hernan", 29);

        
        escuela.agregarEstudiante(estudiante1);
        escuela.agregarEstudiante(estudiante2);

        
        System.out.println("Lista de estudiantes:");
        escuela.mostrarEstudiantes();
    }
}
