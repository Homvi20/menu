
package com.mycompany.menu;


public class Elfo extends Personaje {
    private String reino;
    
    public Elfo(String nombre, String raza, String arma, int vida, int daño, int bonificacion, String reino){
        super(nombre, raza, arma,  vida,  daño, bonificacion);
        this.reino = reino;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
    
    public String Atributos(){
        return super.Atributos()+"- Reino: "+this.reino+"\n"+ "- Bonificacion: Quitar vida"+ "\n";
    }
    
    public String Victoria(){
        return this.getNombre() + "Ha ganado";
    }
    
    public String Derrota(){
        return this.getNombre() + "Ha sido derrotado";                    
    }
    
    public String Historia(){
        return "En lo profundo de la tierra, un valiente elfo desciende dentro de un calabozo buscando vencer a la bestia en su interior.";   
    }
    
    public int quitaVida_int(){
        float quitaVida2= (float) (this.getVida()*0.1);
        int quitaVida=Math.round(quitaVida2);
        
        return quitaVida;
    }
}
