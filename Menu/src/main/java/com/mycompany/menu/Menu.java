
package com.mycompany.menu;
import java.util.*;

public class Menu {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String Nombre = "";
        int Bonificacion = 0;
        Enano e = new Enano(Nombre,"Enano", "Hacha", 456, 8,Bonificacion , "Helhein");
        Elfo f = new Elfo(Nombre, "Elfo", "Daga", 80, 5, Bonificacion, "Eldar");
        Hombre h = new Hombre(Nombre, "Humano", "Mandoble",75, 7, Bonificacion,"Patriarcado");
           
        int p1,p2, rondas,I;
        rondas = 0;
        I=0;
        String continuar;
        
        do{
            System.out.println("BIENVENIDO AL SIMULADOR DE BATALLAS\n");
            System.out.println("Menu de batallas\n");
            System.out.println("Ingrese 1 para jugar con Enano");
            System.out.println("Ingrese 2 para jugar con Elfo");
            System.out.println("Ingrese 3 para jugar con Humano");
            p1 = leer.nextInt();
            
            if(p1==1){
                System.out.println("Usted ha escogido al enano");
                System.out.println("Escoja un nombre para su guerrero: ");
                e.setNombre(leer.next());
                System.out.println("Estos son los atributos de su personaje: \n" + e.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+e.getNombre()+" vs Elfo \n");
                System.out.println("(2) "+e.getNombre()+" vs Humano \n");
                System.out.println("Considere los siguientes los atributos del Elfo al momento de combatir: \n" + f.Atributos());
                System.out.println("Considere los siguientes los atributos del Humano al momento de combatir: \n" + h.Atributos());


                p2 = leer.nextInt();
                if(p2==1){
                    
                    while(10>I){  
                        e.Combate(f);
                        f.Combate(e);
  
                        if(f.getVida()<0){
                        f.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(e.getVida()<=0){                           
                        e.setVida(0);
                        I = 10;    
                        }
                        else{
                         I= I + 1;   
                        }
                        System.out.println("\n---Ronda " + (rondas+1)+"---");

                        System.out.println(e.getNombre()+ " ha atacado a " + f.getRaza()+" con su "+ e.getArma());
                        System.out.println(f.getRaza()+" sangra");
                        System.out.println("La vida de " + f.getRaza()+ " baja a " + f.getVida()+ " puntos \n" );

                        System.out.println(f.getRaza()+ " ha atacado a " + e.getRaza()+" con su "+ f.getArma());
                        System.out.println(e.getNombre()+" sangra");
                        System.out.println("La vida de " + e.getNombre() + " baja a " + e.getVida()+" puntos \n" );
                        
                        if (rondas == 9){
                            if (e.getVida()>f.getVida()){
                                System.out.println(e.Victoria());
                                
                            }
                            if (f.getVida()>e.getVida()){
                                System.out.println(e.Derrota());
                                System.out.println(e.Historia());
                            }
                            if (f.getVida()==e.getVida()){
                                System.out.println("Esta batalla ha concluido en un empate.");
                            }
                        }
                        rondas = rondas+1;
                    }
                       
                }
                else if(p2==2)
                    while(10>I){  
                        e.Combate(h);
                        h.Combate(e);
  
                        if(h.getVida()<0){
                        h.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(e.getVida()<=0){                           
                        e.setVida(0);
                        I = 10;    
                        }
                        else{
                         I= I + 1;   
                        }
                        System.out.println("\n---Ronda " + (rondas+1)+"---");

                        System.out.println(e.getNombre()+ " ha atacado a " + h.getRaza()+" con su "+ e.getArma());
                        System.out.println(h.getRaza()+" sangra");
                        System.out.println("La vida de " + h.getRaza()+ " baja a " + h.getVida()+ " puntos \n" );

                        System.out.println(h.getRaza()+ " ha atacado a " + e.getRaza()+" con su "+ h.getArma());
                        System.out.println(e.getNombre()+" sangra");
                        System.out.println("La vida de " + e.getNombre() + " baja a " + e.getVida()+" puntos \n" );
                        
                        if (rondas == 9){
                            if (e.getVida()>h.getVida()){
                            System.out.println(e.Victoria());

                            }
                            if (h.getVida()>e.getVida()){
                                System.out.println(e.Derrota());
                                System.out.println(e.Historia());
                            }
                            if (h.getVida()==e.getVida()){
                                System.out.println("Esta batalla ha concluido en un empate.");
                            }
                        }
                        rondas = rondas+1;
                    }
                    
                
            }
            else if(p1==2){
                System.out.println("Usted ha escogido al elfo");
                System.out.println("Escoja un nombre para su guerrero: ");
                f.setNombre(leer.next());
                System.out.println("Estos son los atributos de su personaje: \n" + f.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+f.getNombre()+" vs Enano");
                System.out.println("(2) "+f.getNombre()+" vs Humano");
                p2 = leer.nextInt();

                if(p2==1){
                    while(10>I){  
                        f.Combate(e);
                        e.Combate(f);
  
                        if(f.getVida()<0){
                        f.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(e.getVida()<=0){                           
                        e.setVida(0);
                        I = 10;    
                        }
                        else{
                         I= I + 1;   
                        }
                        System.out.println("\n---Ronda " + (rondas+1)+"---");

                        System.out.println(f.getNombre()+ " ha atacado a " + e.getRaza()+" con su "+ f.getArma());
                        System.out.println(e.getRaza()+" sangra");
                        System.out.println("La vida de " + e.getRaza()+ " baja a " + e.getVida()+ " puntos \n" );

                        System.out.println(e.getRaza()+ " ha atacado a " + f.getRaza()+" con su "+ e.getArma());
                        System.out.println(f.getNombre()+" sangra");
                        System.out.println("La vida de " + f.getNombre() + " baja a " + f.getVida()+" puntos \n" );
                        
                        if (rondas == 9){
                            if (f.getVida()>e.getVida()){
                                System.out.println(f.Victoria());
                            }
                            if (e.getVida()>f.getVida()){
                                System.out.println(f.Derrota());
                                System.out.println(f.Historia());
                            }
                            if (e.getVida()==f.getVida()){
                                System.out.println("Esta batalla ha concluido en un empate.");
                            }
                        }
                        rondas = rondas+1;
                    }
                       
                }
                
                if(p2==2){
                    while(10>I){  
                        f.Combate(h);
                        h.Combate(f);
  
                        if(f.getVida()<0){
                        f.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(h.getVida()<=0){                           
                        h.setVida(0);
                        I = 10;    
                        }
                        else{
                         I= I + 1;   
                        }
                        System.out.println("\n---Ronda " + (rondas+1)+"---");

                        System.out.println(f.getNombre()+ " ha atacado a " + h.getRaza()+" con su "+ f.getArma());
                        System.out.println(h.getRaza()+" sangra");
                        System.out.println("La vida de " + h.getRaza()+ " baja a " + h.getVida()+ " puntos \n" );

                        System.out.println(h.getRaza()+ " ha atacado a " + f.getRaza()+" con su "+ h.getArma());
                        System.out.println(f.getNombre()+" sangra");
                        System.out.println("La vida de " + f.getNombre() + " baja a " + f.getVida()+" puntos \n" );
                        
                        if (rondas == 9){
                            if (f.getVida()>h.getVida()){
                                System.out.println(f.Victoria());
                            }
                            if (h.getVida()>f.getVida()){
                                System.out.println(f.Derrota());
                                System.out.println(f.Historia());
                            }
                            if (h.getVida()==f.getVida()){
                                System.out.println("Esta batalla ha concluido en un empate.");
                            }
                        }
                        rondas = rondas+1;
                    }
                       
                }
                
                
             
            }
            else if(p1==3){
                System.out.println("Usted ha escogido al humano");
                System.out.println("Escoja un nombre para su guerrero: ");
                h.setNombre(leer.next());
                System.out.println("Estos son los atributos de su personaje: \n" + h.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+h.getNombre()+" vs Enano");
                System.out.println("(2) "+h.getNombre()+" vs Elfo");
                p2 = leer.nextInt();
                
                if(p2==1){
                    while(10>I){  
                        h.Combate(e);
                        e.Combate(h);
  
                        if(h.getVida()<0){
                        h.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(e.getVida()<=0){                           
                        e.setVida(0);
                        I = 10;    
                        }
                        else{
                         I= I + 1;   
                        }
                        System.out.println("\n---Ronda " + (rondas+1)+"---");

                        System.out.println(h.getNombre()+ " ha atacado a " + e.getRaza()+" con su "+ h.getArma());
                        System.out.println(h.getRaza()+" sangra");
                        System.out.println("La vida de " + e.getRaza()+ " baja a " + e.getVida()+ " puntos \n" );

                        System.out.println(e.getRaza()+ " ha atacado a " + h.getRaza()+" con su "+ e.getArma());
                        System.out.println(h.getNombre()+" sangra");
                        System.out.println("La vida de " + h.getNombre() + " baja a " + h.getVida()+" puntos \n" );
                        
                        if (rondas == 9){
                            if (h.getVida()>e.getVida()){
                                System.out.println(h.Victoria());
                            }
                            if (e.getVida()>h.getVida()){
                                System.out.println(h.Derrota());
                                System.out.println(h.Historia());                                
                            }
                            if (e.getVida()==h.getVida()){
                                System.out.println("Esta batalla ha concluido en un empate.");
                            }
                        }
                        rondas = rondas+1;
                    }
                       
                }
                
                if(p2==2){
                    while(10>I){  
                        h.Combate(f);
                        f.Combate(h);
  
                        if(h.getVida()<0){
                        h.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(f.getVida()<=0){                           
                        f.setVida(0);
                        I = 10;    
                        }
                        else{
                         I= I + 1;   
                        }
                        System.out.println("\n---Ronda " + (rondas+1)+"---");

                        System.out.println(h.getNombre()+ " ha atacado a " + f.getRaza()+" con su "+ h.getArma());
                        System.out.println(f.getRaza()+" sangra");
                        System.out.println("La vida de " + f.getRaza()+ " baja a " + f.getVida()+ " puntos \n" );

                        System.out.println(f.getRaza()+ " ha atacado a " + h.getRaza()+" con su "+ f.getArma());
                        System.out.println(h.getNombre()+" sangra");
                        System.out.println("La vida de " + h.getNombre() + " baja a " + h.getVida()+" puntos \n" );
                        
                        if (rondas == 9){
                            if (h.getVida()>f.getVida()){
                                System.out.println(h.Victoria());
                                
                            }
                            if (f.getVida()>h.getVida()){
                                System.out.println(h.Derrota());
                                System.out.println(h.Historia());
                            }
                            if (f.getVida()==h.getVida()){
                                System.out.println("Esta batalla ha concluido en un empate.");
                            }
                        }
                        rondas = rondas+1;
                    }
                       
                }

            }
                            
            
            System.out.println("Si desea continuar jugando ingrese Si, de lo contrario No");
            continuar = leer.next();
                    
                   
            while((!"Si".equals(continuar)) && (!"No".equals(continuar)) ){
            System.out.println("Error Debe ingresar Si o No");
            System.out.println("Desea continuar ingrese Si, para salir ingrese No");            
            continuar = leer.next();
                    }
                    
            }while("Si".equals(continuar));
            
            
            
        }
        
        
}

