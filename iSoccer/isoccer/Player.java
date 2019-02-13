/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isoccer;

/**
 *
 * @author Neto
 */
public class Player  extends Functionary{
    String position;
    boolean apt;

    public boolean isApt() {
        return apt;
    }

    public void setApt(boolean apt) {
        this.apt = apt;
    }

    @Override
    public String toString() {
        String apto;
        if(apt) apto = "Apto a jogar";
        else apto = "Inápto á jogar";
        return super.toString() + " "+position+" " + apto; //To change body of generated methods, choose Tools | Templates.
    }
    
   public Player(String position , String name, String email, String cpf, String phone, double salary) {
        super(name, email, cpf, phone, salary,"Jogador");
        this.position = position;
        apt = true;
    }
}
