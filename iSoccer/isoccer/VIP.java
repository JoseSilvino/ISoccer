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
public class VIP  extends Person{
    private double contribution;
    //1 se for adimplente e 2 se for inadimplente
    private boolean adimplente;
    private String adress;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public double getContribution() {
        return contribution;
    }

    public void setAdimplente(boolean adimplente) {
        this.adimplente = adimplente;
    }

    public boolean isAdimplente() {
        return adimplente;
    }


    public void setContribution(double contribution) {
        this.contribution = contribution;
    }

    @Override
    public String toString() {
        String adimplencia;
        if(adimplente) {
            adimplencia = "Adimplente";
        }else {
            adimplencia = "Inadimplente";
        }
        return super.toString() + " "+adimplencia+" "+getContribution()+" "+getAdress(); 
    }

    public VIP(double contribution, boolean adimplente, String name, String email, String cpf, String phone,String adress,String type) {
        super(name, email, cpf, phone);
        this.contribution = contribution;
        this.adimplente = adimplente;
        this.adress = adress;
        this.type = type;
    }
    
}
