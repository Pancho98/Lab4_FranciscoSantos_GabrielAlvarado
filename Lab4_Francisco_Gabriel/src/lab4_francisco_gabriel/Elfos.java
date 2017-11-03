/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_francisco_gabriel;

/**
 *
 * @author Francisco Santos
 */
public class Elfos extends Guerrero{
    private String arma;
    private String rango;

    public Elfos() {
        super();
    }

    public Elfos(String arma, String rango) {
        this.arma = arma;
        this.rango = rango;
    }

    public Elfos(String arma, String rango, String nombre, int edad, String nacimiento, int poder, int salud, int costo) {
        super(nombre, edad, nacimiento, poder, salud, costo);
        this.arma = arma;
        this.rango = rango;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Elfos\n"
                +"Nombre: "+super.getNombre()+"\n"
                +"Edad: "+super.getEdad()+"\n"
                +"Lugar de Nacimiento: "+super.getNacimiento()+"\n"
                + "Poder: "+super.getPoder()+"\n"
                + "Salud: "+super.getSalud()+"\n"
                + "Costo: "+super.getCosto();
    }
    
    
}
