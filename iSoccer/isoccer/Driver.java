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
public class Driver  extends Functionary{
   private  int cnh;

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString()+" "+getCnh();
    }
 
    public Driver( String name, String email, String cpf, String phone, double salary,int cnh) {
        super(name, email, cpf, phone, salary,"Motorista");
        this.cnh = cnh;
    }
       
}
