/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Liga {

    private EquipoFutbol[] equipos;
    private int cantidad;
    private int partidosJugados = 0;

    public Liga() {
        equipos = new EquipoFutbol[20];
        cantidad = 0;
        cargarEquipos();
    }

    private void cargarEquipos() {
        equipos[cantidad++] = new EquipoFutbol("Atlético Nacional");
        equipos[cantidad++] = new EquipoFutbol("América de Cali");
        equipos[cantidad++] = new EquipoFutbol("Millonarios FC");
        equipos[cantidad++] = new EquipoFutbol("Junior FC");
        equipos[cantidad++] = new EquipoFutbol("Independiente Medellín");
        equipos[cantidad++] = new EquipoFutbol("Deportivo Cali");
        equipos[cantidad++] = new EquipoFutbol("Independiente Santa Fe");
        equipos[cantidad++] = new EquipoFutbol("Deportes Tolima");
        equipos[cantidad++] = new EquipoFutbol("Once Caldas");
        equipos[cantidad++] = new EquipoFutbol("Atlético Bucaramanga");
        equipos[cantidad++] = new EquipoFutbol("Deportivo Pasto");
        equipos[cantidad++] = new EquipoFutbol("Deportivo Pereira");
        equipos[cantidad++] = new EquipoFutbol("Fortaleza CEIF");
        equipos[cantidad++] = new EquipoFutbol("Águilas Doradas");
        equipos[cantidad++] = new EquipoFutbol("Alianza FC");
        equipos[cantidad++] = new EquipoFutbol("Jaguares de Córdoba");
        equipos[cantidad++] = new EquipoFutbol("Boyacá Chicó");
        equipos[cantidad++] = new EquipoFutbol("Cúcuta Deportivo");
        equipos[cantidad++] = new EquipoFutbol("Internacional de Bogotá");
        equipos[cantidad++] = new EquipoFutbol("Llaneros FC");
    }


    public void jugarPartido(int indice1, int indice2, int goles1, int goles2) {

        EquipoFutbol equipo1 = equipos[indice1];
        EquipoFutbol equipo2 = equipos[indice2];

        if (goles1 > goles2) {
            equipo1.ganar();
            equipo2.perder();
        } else if (goles2 > goles1) {
            equipo2.ganar();
            equipo1.perder();
        } else {
            equipo1.empatar();
            equipo2.empatar();
        }
        
        partidosJugados++;
    }
    
    public boolean hayPartidos() {
        return partidosJugados > 0;
    }

    public String mostrarEquipos() {
        String lista = "";
        for (int i = 0; i < cantidad; i++) {
            lista += i + ". " + equipos[i].mostrarDatos() + "\n";
        }
        return lista;
    }
    

    public int mayorPuntaje() {
        int mayor = equipos[0].getPuntos();

        for (int i = 1; i < cantidad; i++) {
            if (equipos[i].getPuntos() > mayor) {
                mayor = equipos[i].getPuntos();
            }
        }
        return mayor;
    }

    
    public String mejoresEquipos() {
        int mayor = mayorPuntaje();
        String resultado = "";
        int contador = 0;

        for (int i = 0; i < cantidad; i++) {
            if (equipos[i].getPuntos() == mayor) {
                resultado += equipos[i].mostrarDatos(true) + "\n";
                contador++;
            }
        }

        resultado += "\nCantidad: " + contador;
        return resultado;
    }


    public String buscarEquipo(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (equipos[i].getNombre().equalsIgnoreCase(nombre)) {
                return equipos[i].mostrarDatos();
            }
        }
        return "Equipo no encontrado";
    }

    public String listarNombres() {
        String lista = "";

        for (int i = 0; i < cantidad; i++) {
            lista += (i+1) + ". " + equipos[i].getNombre() + "\n";
        }

        return lista;
    }
}
