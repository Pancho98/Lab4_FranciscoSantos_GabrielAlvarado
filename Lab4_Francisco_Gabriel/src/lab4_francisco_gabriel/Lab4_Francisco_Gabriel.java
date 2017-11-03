package lab4_francisco_gabriel;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Santos
 */


public class Lab4_Francisco_Gabriel {

    static ArrayList<Magos> ListMagos = new ArrayList();

    static ArrayList<Elfos> ListElfos = new ArrayList();


    static ArrayList<Dragones> ListDragones = new ArrayList();
    static ArrayList<Arqueros> ListArqueros = new ArrayList();
    static ArrayList<Brujas> ListBrujas = new ArrayList();
       static ArrayList<Jugador> jugadores=new ArrayList();
       static ArrayList<Jugador>jugadores2 = new ArrayList();
    static ArrayList<Guerrero> guerreros = new ArrayList();
    

    public static void main(String[] args) {
         String opcion = "";
        while (!opcion.equalsIgnoreCase("g")) {
            opcion = JOptionPane.showInputDialog("MENU\n"
                    + "a.Creacion de Guerreros\n"
                    + "b.Eliminacion de Guerrero\n"
                    + "c.Registro de Jugardores\n"
                    + "d.Iniciar Partidad\n"
                    + "e.Listar Jugadores\n"
                    + "f.Cargar partida"
                    + "g.Salir\n");
            if (opcion.equalsIgnoreCase("a")) {
                String jugadores = "";
                jugadores = JOptionPane.showInputDialog("MENU\n"
                        + "a.Crear Magos\n"
                        + "b.Crear Elgos\n"
                        + "c.Crear Dragones\n"
                        + "d.Crear Arqueros\n"
                        + "e.Crear Brujas\n");
            
                    
                
                String nombre;
                int edad;
                String lugar;
                
                int poder;
                int salud;
                int costo;
                String nacimiento;
                
                 nombre =JOptionPane.showInputDialog("Ingrese nombre");
                edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
                try {
                    
                
                 lugar = JOptionPane.showInputDialog("Ingrese lugar");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                poder=Integer.parseInt(JOptionPane.showInputDialog("Ingrese poder"));
                salud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Salud"));
                costo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese costo"));
                nacimiento =JOptionPane.showInputDialog("Ingrese nacimiento");
               
                if (jugadores.equalsIgnoreCase("a")) {
                    String tipo = JOptionPane.showInputDialog("Ingrese tipo de magia");
                    String elemento = JOptionPane.showInputDialog("Ingrese elemento favorito");
                    ListMagos.add(new Magos(tipo, elemento, nombre, edad, nacimiento, poder, salud, costo));
                }
                if (jugadores.equalsIgnoreCase("b")) {
                    String tipo = JOptionPane.showInputDialog("Ingrese tipo de arma");
                    String rango = JOptionPane.showInputDialog("Ingrese Rango");
                    ListElfos.add(new Elfos(tipo, rango, nombre, edad, nacimiento, poder, salud, costo));
                }
                if (jugadores.equalsIgnoreCase("c")) {
                    String color = JOptionPane.showInputDialog("Ingrese color");
                    String raza = JOptionPane.showInputDialog("Ingres raza");
                    ListDragones.add(new Dragones(Color.yellow, raza, nombre, edad, nacimiento, poder, salud, costo));
                }
                if (jugadores.equalsIgnoreCase("d")) {
                    String materialA = JOptionPane.showInputDialog("Ingrese material de Arco");
                    String materiaAr = JOptionPane.showInputDialog("Ingrese material de armadura");
                    ListArqueros.add(new Arqueros(materiaAr, materiaAr, nombre, edad, nacimiento, poder, salud, costo));
                }
                if (jugadores.equalsIgnoreCase("e")) {
                    int siglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese siglo de nacimiento"));
                    String lugar2 = JOptionPane.showInputDialog("Ingrese lugar de residencia");
                    ListBrujas.add(new Brujas(siglo, lugar2, nombre, edad, nacimiento, poder, salud, costo));
                }

            }
            if (opcion.equalsIgnoreCase("b")) {
               String eliminar ="";
              eliminar = JOptionPane.showInputDialog("MENU\n"
                        + "a.Eliminar Magos\n"
                        + "b.Eliminar Elgos\n"
                        + "c.Eliminar Dragones\n"
                        + "d.Eliminar Arqueros\n"
                        + "e.Eliminar Brujas\n");
                if (eliminar.equalsIgnoreCase("a")) {
                    String l="";
                    for (Magos a : ListMagos) {
                        l += ListMagos.indexOf(a) + "" + ((Magos)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    ListMagos.remove(pos);
                }
                if (eliminar.equalsIgnoreCase("b")) {
                    String l="";
                    for (Elfos a : ListElfos) {
                        l += ListElfos.indexOf(a) + "" + ((Elfos)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    ListElfos.remove(pos);
                }
                if (eliminar.equalsIgnoreCase("c")) {
                    String l="";
                    for (Dragones a : ListDragones) {
                        l += ListDragones.indexOf(a) + "" + ((Dragones)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                    
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    ListDragones.remove(pos);
                }
                if (eliminar.equalsIgnoreCase("d")) {
                    String l="";
                    for (Arqueros a : ListArqueros) {
                        l += ListArqueros.indexOf(a) + "" + ((Arqueros)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    ListArqueros.remove(pos);
                }
                if (eliminar.equalsIgnoreCase("e")) {
                    String l="";
                    for (Brujas a : ListBrujas) {
                        l += ListBrujas.indexOf(a) + "" + ((Brujas)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    ListBrujas.remove(pos);
                }
            }
            if (opcion.equalsIgnoreCase("c")) {
                CrearJugador();
                
            }
            if (opcion.equalsIgnoreCase("d")) {
                 String eliminar ="";
              eliminar = JOptionPane.showInputDialog("MENU\n"
                        + "a.Listar Magos\n"
                        + "b.Listar Elgos\n"
                        + "c.Listar Dragones\n"
                        + "d.Listar Arqueros\n"
                        + "e.Listar Brujas\n");
                if (eliminar.equalsIgnoreCase("a")) {
                    String l="";
                    for (Magos a : ListMagos) {
                        l += ListMagos.indexOf(a) + "" + ((Magos)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                  
                }
                if (eliminar.equalsIgnoreCase("b")) {
                    String l="";
                    for (Elfos a : ListElfos) {
                        l += ListElfos.indexOf(a) + "" + ((Elfos)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                   
                }
                if (eliminar.equalsIgnoreCase("c")) {
                    String l="";
                    for (Dragones a : ListDragones) {
                        l += ListDragones.indexOf(a) + "" + ((Dragones)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                    
                  
                }
                  if (eliminar.equalsIgnoreCase("d")) {
                    String l="";
                    for (Arqueros a : ListArqueros) {
                        l += ListArqueros.indexOf(a) + "" + ((Arqueros)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                 
                }
                if (eliminar.equalsIgnoreCase("e")) {
                    String l="";
                    for (Brujas a : ListBrujas) {
                        l += ListBrujas.indexOf(a) + "" + ((Brujas)a);
                    }
                    JOptionPane.showInputDialog(null, l);
                    
                }
                
                
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
}
 
    
    
    
    
    

                 
