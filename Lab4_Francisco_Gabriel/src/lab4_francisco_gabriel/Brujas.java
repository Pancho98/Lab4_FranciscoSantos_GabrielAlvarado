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
public class Brujas extends Guerrero{
    private int siglo;
    private String Residencia;

    public Brujas() {
        super();
    }

    public Brujas(int siglo, String Residencia) {
        this.siglo = siglo;
        this.Residencia = Residencia;
    }

    public Brujas(int siglo, String Residencia, String nombre, int edad, String nacimiento, int poder, int salud, int costo) {
        super(nombre, edad, nacimiento, poder, salud, costo);
        this.siglo = siglo;
        this.Residencia = Residencia;
    }

    public int getSiglo() {
        return siglo;
    }

    public void setSiglo(int siglo) {
        this.siglo = siglo;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    @Override
    public String toString() {
        return "Brujas{" + "siglo=" + siglo + ", Residencia=" + Residencia + '}';
    }
    
}