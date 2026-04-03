/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Equipo {
    protected String nombre;
    protected int pg;
    protected int pe; 
    protected int pp;
    protected int pj;
    protected int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.pg = 0;
        this.pe = 0;
        this.pp = 0;
        this.pj = 0;
        this.puntos = 0;
    }

    public int calcularPuntos() {
        puntos = (pg * 3) + pe;
        return puntos;
    }

    public void actualizarPuntos() {
        puntos = calcularPuntos();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public String mostrarDatos() {
        return "Equipo: " + nombre +
               "\nPartidos Ganados: " + pg +
               " Partidos Empatados: " + pe +
               " Partidos Perdidos: " + pp +
               "\nPartidos Jugados: " + pj +
               " Puntos: " + puntos + "\n";
    }
}
