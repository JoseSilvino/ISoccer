/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isoccer;

import java.util.ArrayList;

/**
 *
 * @author Neto
 */
public class Stadium {
    private boolean available;
    private int bathrooms;
    private int sits;
    private int fastfood;

    public void setSits(int sits) {
        this.sits = sits;
    }

    public void setFastfood(int fastfood) {
        this.fastfood = fastfood;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getSits() {
        return sits;
    }

    public int getFastfood() {
        return fastfood;
    }

    public int getBathrooms() {
        return bathrooms;
    }
   
    public static int containsFree(ArrayList<Stadium> resource) {
                int t = resource.size();
       for(int i = 0 ; i < t ; i ++) {
           if(resource.get(i).isAvailable()) {
               return i;
           }
       }
       return -1;
    }
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        String disponivel ;
        if(available) disponivel = "Disponível";
        else disponivel = "Indisponível";
        
       return "Lanchonetes :"+ Integer.toString(fastfood)+ " "+"Banheiros :"+Integer.toString(bathrooms)+" Assentos : " + Integer.toString(sits) +disponivel;
    }

   

    public Stadium(boolean available, int bathrooms, int sits, int fastfood) {
        this.available = available;
        this.bathrooms = bathrooms;
        this.sits = sits;
        this.fastfood = fastfood;
    }
    
}
