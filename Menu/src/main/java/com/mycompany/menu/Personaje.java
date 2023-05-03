
package com.mycompany.menu;
import java.util.*;

public class Personaje {
    private String nombre, raza, arma;
    private int vida, daño, bonificacion;
    
    
    public Personaje(String nombre, String raza, String arma, int vida, int daño, int bonificacion) {
        this.nombre = nombre;
        this.raza = raza;
        this.arma = arma;
        this.vida = vida;
        this.daño = daño;
        this.bonificacion = bonificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    public String Atributos(){
        return"- Nombre: "+this.nombre+"\n" +"- Raza: "+this.raza+"\n"+"- Arma: "+this.arma+"\n" + "- Vida: "+this.vida+"\n"+"- Daño: "+this.daño+"\n";
    }
    
    
    
     
    /*
    public String Derrota(){
        String mensajeFinal = "";
        if (this.raza=="Enano"){
            mensajeFinal = "Mala suerte, has sido derrotado, deberias probar otra arma...";
        }
        if (this.raza=="Elfo"){
            this.Historia();
            mensajeFinal = "Lamentablemente, el valiente elfo fue derrotado.";
        }
        if (this.raza=="Humano"){
            mensajeFinal = "Mala suerte, has sido derrotado, te recomiendo ponerte a entrenar.";
        }
        return mensajeFinal;
        
    }
    */
    public int Combate(Personaje p2){
        int daño_total;
        
        daño_total =(p2.getVida() - this.daño);
        p2.setVida(daño_total);  
        return daño_total;
    }
    
  
    /*public void Combate(){
        int ronda=0;
        while (ronda < 10) {

            
            System.out.println(enano.getVida() + " saff " + elfo.getVida());
            System.out.println(("Pelea " + (round + 1)) + ":");
            enano.setVida(enano.getVida() - elfo.getDaño());
            elfo.setVida(elfo.getVida() - enano.getDaño());

            System.out.println("enano tiene " + enano.getVida() + " y el elfo tiene " + elfo.getVida());
            if(enano.getVida() <=0 || elfo.getVida() <= 0){
                break;
            }
            ronda++;
        }
        if (enano.getVida() > elfo.getVida()) {
            System.out.println("enano perdio");
          
        } else if (elfo.getVida() > enano.getVida()) {
            System.out.println("elfo perdio");
          

        }
    }
  */
    
}
