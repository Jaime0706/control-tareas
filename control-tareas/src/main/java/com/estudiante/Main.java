package com.estudiante;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>();

        tareas.add(new Tarea(1L, "Comprar alimentos", "Comprar productos para la semana", "ALTA", false));
        tareas.add(new Tarea(2L, "Realizar ejercicios", "Rutina de 30 minutos", "MEDIA", true));
        tareas.add(new Tarea(3L, "Estudiar Programación II", "Repasar Maven, HTTP y REST", "ALTA", false));

        System.out.println("===== LISTADO DE TAREAS =====");
        System.out.println();

        int pendientes = 0;
        int completadas = 0;

        for (Tarea tarea : tareas) {
            tarea.mostrarInformacion();
            if (tarea.isCompletada()) {
                completadas++;
            } else {
                pendientes++;
            }
        }

        System.out.println();
        System.out.println("Tareas pendientes: " + pendientes);
        System.out.println("Tareas completadas: " + completadas);
    }
}
