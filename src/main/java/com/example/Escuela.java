package com.example;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private List<Estudiante> estudiantes;

    public Escuela() {
        this.estudiantes = new ArrayList<>();
    }

    
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
