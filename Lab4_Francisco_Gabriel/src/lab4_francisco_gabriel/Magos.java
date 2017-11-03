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
public class Magos extends Guerrero{
    private String magia;
    private String elemento;

    public Magos() {
        super();
    }

    public Magos(String magia, String elemento) {
        this.magia = magia;
        this.elemento = elemento;
    }

    public Magos(String magia, String elemento, String nombre, int edad, String nacimiento, int poder, int salud, int costo) {
        super(nombre, edad, nacimiento, poder, salud, costo);
        this.magia = magia;
        this.elemento = elemento;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Magos\n"
                +"Nombre: "+super.getNombre()+"\n"
                +"Edad: "+super.getEdad()+"\n"
                +"Lugar de Nacimiento: "+super.getNacimiento()+"\n"
                + "Poder: "+super.getPoder()+"\n"
                + "Salud: "+super.getSalud()+"\n"
                + "Costo: "+super.getCosto();
    }
    
    
}
