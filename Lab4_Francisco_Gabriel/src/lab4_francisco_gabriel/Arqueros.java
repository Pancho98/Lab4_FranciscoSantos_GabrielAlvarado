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
public class Arqueros extends Guerrero{
    private String materialArco;
    private String materiaArmadura;

    public Arqueros() {
        super();
    }

    public Arqueros(String materialArco, String materiaArmadura) {
        this.materialArco = materialArco;
        this.materiaArmadura = materiaArmadura;
    }

    public Arqueros(String materialArco, String materiaArmadura, String nombre, int edad, String nacimiento, int poder, int salud, int costo) {
        super(nombre, edad, nacimiento, poder, salud, costo);
        this.materialArco = materialArco;
        this.materiaArmadura = materiaArmadura;
    }

    public String getMaterialArco() {
        return materialArco;
    }

    public void setMaterialArco(String materialArco) {
        this.materialArco = materialArco;
    }

    public String getMateriaArmadura() {
        return materiaArmadura;
    }

    public void setMateriaArmadura(String materiaArmadura) {
        this.materiaArmadura = materiaArmadura;
    }

    @Override
    public String toString() {
        return "Arqueros\n"
                +"Nombre: "+super.getNombre()+"\n"
                +"Edad: "+super.getEdad()+"\n"
                +"Lugar de Nacimiento: "+super.getNacimiento()+"\n"
                + "Poder: "+super.getPoder()+"\n"
                + "Salud: "+super.getSalud()+"\n"
                + "Costo: "+super.getCosto();
    } 

    @Override
    public double Atacar(Jugador j1, Jugador j2) {
        int ataque1=0;
        while (j1.getGuerrero().getSalud()>0 || j2.getGuerrero().getSalud()>0) {            
            ataque1=j1.getGuerrero().getPoder();
        }
        return ataque1;
    }
}
