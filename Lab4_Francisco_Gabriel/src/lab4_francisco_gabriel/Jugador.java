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
public class Jugador {

    private String nombre;
    private int dinero;
    private int puntos;
    private Guerrero guerrero;

    public Jugador() {
    }

    public Jugador(String nombre, int dinero, int puntos, Guerrero guerrero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.puntos = getPuntos();
        this.guerrero = guerrero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        if (puntos==0) {
            this.puntos = puntos;
        }else{
            this.puntos=0;
        }
    }

    public Guerrero getGuerrero() {
        return guerrero;
    }

    public void setGuerrero(Guerrero guerrero) {
        this.guerrero = guerrero;
    }

}
