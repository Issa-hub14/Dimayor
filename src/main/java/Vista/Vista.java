/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author isabe
 */
import javax.swing.JOptionPane;

public class Vista {

    public int mostrarMenu() {
        String menu = """
                      MENU PRINCIPAL
                      1. Lista de los equipos del certamen
                      2. Agregar partido
                      3. Mostrar el mejor puntaje
                      4. Buscar un equipo
                      5. Mostrar mejor(es) equipo(s)
                      6. Salir
                      
                      Elige una opción:
                      """;

        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public int seleccionarEquipo(String mensaje) {
        int indice = -1;

        while (indice <= 0 || indice > 20) {
            try {
                indice = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if (indice <= 0 || indice > 20) {
                    JOptionPane.showMessageDialog(null,
                            "Índice inválido. Debe estar entre 1 y 20");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido");
            }
        }
        return indice;
    }

    public int pedirGoles(String mensaje) {
        int goles = -1;

        while (goles < 0) {
            try {
                goles = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if (goles < 0) {
                    JOptionPane.showMessageDialog(null, "No se permiten números negativos");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo números válidos");
            }
        }

        return goles;
    }

    public String pedirNombreEquipo() {
        return JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
