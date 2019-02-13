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
public class Bus {
       private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public  static int containsFree(ArrayList<Bus> resource) {
        int t = resource.size();
       for(int i = 0 ; i < t ; i ++) {
           if(resource.get(i).isAvailable()) {
               return i;
           }
       }
       return -1;
    }
    public Bus(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        if(available) return "Disponível";
        return "Indísponível";
    }

    
       
}
