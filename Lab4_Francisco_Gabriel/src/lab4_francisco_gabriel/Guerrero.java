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
public abstract class Guerrero {
    private String nombre;
    private int edad;
    private String nacimiento;
    private int poder;
    private int salud;
    private int costo;

    public Guerrero() {
    }

    public Guerrero(String nombre, int edad, String nacimiento, int poder, int salud, int costo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.poder =poder;
        this.salud =salud;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if (poder>0 && poder<=50) {
            this.poder = poder;
        }
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        if (salud>=100 && salud<=200) {
            this.salud = salud;
        }
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        if (costo>0 && costo<=300) {
            this.costo = costo;
        }
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + '}';
    }

    public abstract double Atacar(Jugador j1, Jugador j2);
    
    
    
}
