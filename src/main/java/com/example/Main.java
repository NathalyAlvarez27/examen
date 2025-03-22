package com.example;



public class Main {
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