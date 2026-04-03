/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class EquipoFutbol extends Equipo {

    public EquipoFutbol(String nombre) {
        super(nombre);
    }


    @Override
    public int calcularPuntos() {
        return (pg * 3) + pe;
    }


    public void ganar() {
        pg++;
        pj++;
        actualizarPuntos();
    }

    public void empatar() {
        pe++;
        pj++;
        actualizarPuntos();
    }

    public void perder() {
        pp++;
        pj++;
        actualizarPuntos();
    }

    public String mostrarDatos(boolean versionCorta) {
        if (versionCorta) {
            return nombre + " - Puntos: " + puntos;
        }
        return mostrarDatos();
    }

}
