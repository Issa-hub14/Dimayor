/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author isabe
 */
import Modelo.Liga;
import Vista.Vista;

public class DimayorControlador {

    private Liga liga;
    private Vista vista;

    public DimayorControlador() {
        liga = new Liga();
        vista = new Vista();
    }

    public void iniciar() {

        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    vista.mostrarMensaje(liga.listarNombres());
                    break;

                case 2:
                    vista.mostrarMensaje(liga.listarNombres());
                    int i1;
                    int i2;
                    do{
                        i1 = vista.seleccionarEquipo("Seleccione índice equipo 1:");
                        i2 = vista.seleccionarEquipo("Seleccione índice equipo 2:");
                        
                        if (i1 == i2) {
                            vista.mostrarMensaje("No puedes elegir el mismo equipo");
                        }
                    } while (i1 == i2);
            
                    int goles1 = vista.pedirGoles("Ingrese goles del equipo 1:");
                    int goles2 = vista.pedirGoles("Ingrese goles del equipo 2:");

                    liga.jugarPartido(i1-1, i2-1, goles1, goles2);

                    vista.mostrarMensaje("Partido registrado correctamente");
                    break;

                case 3:
                    int mayor = liga.mayorPuntaje();
                    vista.mostrarMensaje("Mayor puntaje: " + mayor);
                    break;

                case 4:
                    String nombre = vista.pedirNombreEquipo();
                    vista.mostrarMensaje(liga.buscarEquipo(nombre));
                    break;

                case 5:
                    vista.mostrarMensaje(liga.mejoresEquipos());
                    break;

                case 6:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;

                default:
                    vista.mostrarMensaje("Opción inválida");
            }

        } while (opcion != 6);
    }
}

