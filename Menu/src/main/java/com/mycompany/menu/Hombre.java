
package com.mycompany.menu;


public class Hombre extends Personaje {
    private String casta;
    
    public Hombre(String nombre, String raza, String arma, int vida, int daño, int bonificacion, String casta){
        super(nombre, raza, arma, vida, daño, bonificacion);
        this.casta = casta;  
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }
    
    public String Atributos(){
        return super.Atributos()+"- Casta: "+this.casta+"\n"+"- Bonificacion: Actualizar arma"+ "\n";
    }
    
    public String Victoria(){
        return this.getNombre() + "Ha ganado";
    }
    
    public String Derrota(){
        return this.getNombre() + "Ha sido derrotado";                   
    }
    
    public String Historia(){
        return "En las profundidades de un calabozo,\nun aventurero humano se ve las caras contra un poderoso enemigo.";   
    }
    
    
    
}
