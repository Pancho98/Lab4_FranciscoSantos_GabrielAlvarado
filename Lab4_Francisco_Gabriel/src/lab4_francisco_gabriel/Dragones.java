/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_francisco_gabriel;

import java.awt.Color;

/**
 *
 * @author Francisco Santos
 */
public class Dragones extends Guerrero{
    private Color color;
    private String raza;

    public Dragones() {
        super();
    }

    public Dragones(Color color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public Dragones(Color color, String raza, String nombre, int edad, String nacimiento, int poder, int salud, int costo) {
        super(nombre, edad, nacimiento, poder, salud, costo);
        this.color = color;
        this.raza = raza;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Dragones\n"
                +"Nombre: "+super.getNombre()+"\n"
                +"Edad: "+super.getEdad()+"\n"
                +"Lugar de Nacimiento: "+super.getNacimiento()+"\n"
                + "Poder: "+super.getPoder()+"\n"
                + "Salud: "+super.getSalud()+"\n"
                + "Costo: "+super.getCosto();
    }
    
    
}
