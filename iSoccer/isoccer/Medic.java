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
public class Medic extends Functionary {

    private int crm;

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getCrm(); //To change body of generated methods, choose Tools | Templates.
    }

    public Medic( String name, String email, String cpf, String phone, double salary,int crm) {
        super(name, email, cpf, phone, salary,"Médico");
        this.crm = crm;
    }
    

}
