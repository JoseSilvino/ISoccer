/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isoccer;
import isoccerGUI.iSoccerGUI;
import java.util.*;
/**
 *
 * @author Neto
 */
public class ISoccer {

    /**
     *
     * @param cp
     * @return
     * @throws CPFException
     * throws a exception if the cpf format if wrong
     */
    public static String getCPF(String cp) throws CPFException {
        int t = cp.length();
        if(t!=14) {
            throw new CPFException("Entrada inválida para um CPF");
        }        
        for(int i = 0 ; i < t ; i ++) {
        if(Character.isDigit(cp.charAt(i))||((cp.charAt(i))!='.')&&(i!=3||i!=7)||(cp.charAt(i)!='-'&&i!=11)) {
          throw new CPFException ("Entrada inválida para um CPF");
            }
        
        }
        return cp;
    }
    public static boolean searchVIP(ArrayList<VIP> func,String email) {
        int t = func.size();
        for(int i = 0 ; i < t; i ++) {
            if(func.get(i).getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
       public static boolean search(ArrayList<Functionary> func,String email) {
        int t = func.size();
        for(int i = 0 ; i < t; i ++) {
            if(func.get(i).getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iSoccerGUI s = new iSoccerGUI();
        s.functionarys = new ArrayList<>();
        s.vips = new ArrayList<>();
        s.buses = new ArrayList<>();
        s.centers = new ArrayList<>();
        s.stadiums = new ArrayList<>();
        s.setVisible(true);
        // TODO code application logic here
    }
    
}
