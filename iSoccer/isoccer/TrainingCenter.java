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
public class TrainingCenter {
    private boolean available;
    private int bedrooms;

    public int getBedrooms() {
        return bedrooms;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    @Override
    public String toString() {
        String availavel;
        if(this.available) availavel = "Disponível";
        else availavel = "Indisponível";
        return getBedrooms() + " " + availavel;
    }

    
    public static int containsFree(ArrayList<TrainingCenter> resource) {
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

    public TrainingCenter(boolean available, int bedrooms) {
        this.available = available;
        this.bedrooms = bedrooms;
    }
    
}
