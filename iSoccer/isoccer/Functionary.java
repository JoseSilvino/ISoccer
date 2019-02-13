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
public class Functionary extends Person{
    private double salary;
    private String classe;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " "+getClasse(); 
    }
 
    public Functionary(String name, String email, String cpf, String phone, double salary,String classe) {
        super(name,email,cpf,phone);
        this.salary = salary;
        this.classe = classe;
    }
    
}
