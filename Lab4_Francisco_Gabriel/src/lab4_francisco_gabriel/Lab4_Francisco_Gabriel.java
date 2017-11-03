package lab4_francisco_gabriel;

<<<<<<< HEAD
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Santos
 */


public class Lab4_Francisco_Gabriel {

    static ArrayList<Magos> ListMagos = new ArrayList();
    static ArrayList<Elgos> ListElfos = new ArrayList();
    static ArrayList<Dragones> ListDragones = new ArrayList();
    static ArrayList<Arqueros> ListArqueros = new ArrayList();
    static ArrayList<Brujas> ListBrujas = new ArrayList();

    public static void main(String[] args) {
        String opcion = "";
        while (!opcion.equalsIgnoreCase("g")) {
            opcion = JOptionPane.showInputDialog("MENU\n"
                    + "a.Creacion de Guerreros\n"
                    + "b.Eliminacion de Guerrero\n"
                    + "c.Registro de Jugardores\n"
                    + "d.Iniciar Partidad\n"
                    + "e.Listar Jugadores\n"
                    + "f.Cargar partidad"
                    + "g.Salir\n");
            if (opcion.equalsIgnoreCase("a")) {
                String jugadores = "";
                jugadores = JOptionPane.showInputDialog("MENU\n"
                        + "a.Crear Magos\n"
                        + "b.Crear Elgos\n"
                        + "c.Crear Dragones\n"
                        + "d.Crear Arqueros\n"
                        + "e.Crear Brujas\n");
                if (jugadores.equalsIgnoreCase("a")) {
                    String tipo = JOptionPane.showInputDialog("Ingrese tipo de magia");
                    String elemento = JOptionPane.showInputDialog("Ingrese elemento favorito");
                }
                if (jugadores.equalsIgnoreCase("b")) {
                    String tipo = JOptionPane.showInputDialog("Ingrese tipo de arma");
                    String rango = JOptionPane.showInputDialog("Ingrese Rango");
                }
                if (jugadores.equalsIgnoreCase("c")) {
                    String color = JOptionPane.showInputDialog("Ingrese color");
                    String raza = JOptionPane.showInputDialog("Ingres raza");
                }
                if (jugadores.equalsIgnoreCase("d")) {
                    String materialA = JOptionPane.showInputDialog("Ingrese material de Arco");
                    String materiaAr = JOptionPane.showInputDialog("Ingrese material de armadura");
                }
                if (jugadores.equalsIgnoreCase("e")) {
                    String siglo = JOptionPane.showInputDialog("Ingrese siglo de nacimiento");
                    String lugar = JOptionPane.showInputDialog("Ingrese lugar de residencia");
                }

            }
            if (opcion.equalsIgnoreCase("b")) {

            }
            if (opcion.equalsIgnoreCase("c")) {

            }

        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void CrearJugador(){
        String nombre=JOptionPane.showInputDialog("Ingrese Nombre del Jugador");
        int dinero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Dinero:"));
        for (Guerrero t : guerreros) {
            if (t instanceof Magos) {
               int cont=guerreros.indexOf(t);
              JOptionPane.showMessageDialog(null,cont+".- "+ t);
            }
            if (t instanceof Elfos) {
                int cont=guerreros.indexOf(t);
              JOptionPane.showMessageDialog(null, cont+".- "+ t);  
            }
            if (t instanceof Dragones) {
                int cont=guerreros.indexOf(t);
              JOptionPane.showMessageDialog(null, cont+".- "+ t);  
            }
            if (t instanceof Arqueros) {
                int cont=guerreros.indexOf(t);
              JOptionPane.showMessageDialog(null, cont+".- "+ t);  
            }
            if (t instanceof Brujas) {
                int cont=guerreros.indexOf(t);
              JOptionPane.showMessageDialog(null, cont+".- "+ t);  
            }
        }
    }
    static ArrayList<Jugador> jugadores=new ArrayList();
    static ArrayList<Guerrero> guerreros = new ArrayList();
    
    
    
    
    
    
}
