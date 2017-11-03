/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_francisco_gabriel;

/**
 *
 * @author Gabriel Alvarado
 */
public class Guardar {
 private Jugador j1;
 private Jugador j2 ;

    public Guardar() {
    }

    public Guardar(Jugador j1, Jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    public Jugador getJ1() {
        return j1;
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }

    @Override
    public String toString() {
        return "Guardar{" + "j1=" + j1 + ", j2=" + j2 + '}';
    }

}
