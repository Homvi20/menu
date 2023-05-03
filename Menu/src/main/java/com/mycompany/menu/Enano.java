
package com.mycompany.menu;


public class Enano extends Personaje {
    private String clan;
    int aumenta_vida;
    
    public Enano(String nombre, String raza, String arma, int vida, int daño, int bonificacion, String clan){
        super(nombre, raza, arma, vida, daño, bonificacion);
        this.clan = clan;  
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }
    
    public String Atributos(){
        return super.Atributos()+"- Clan: "+this.clan+"\n"+"- Bonificacion: Aumentar vida"+ "\n";
    }
    
    public String Victoria(){
        return this.getNombre() + "Ha ganado";
    }
    
    public String Derrota(){
        return this.getNombre() + "Ha sido derrotado";
                        
    }
    
    public String Historia(){
        return "En las profundidades de un calabozo,un aventurero enano se ve las caras contra un poderoso enemigo";   
    }
    

    
    
}
