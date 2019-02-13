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
public class CPFException extends Exception {

    /**
     * Creates a new instance of <code>CPFException</code> without detail
     * message.
     */
    public CPFException() {
    }

    /**
     * Constructs an instance of <code>CPFException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public CPFException(String msg) {
        super(msg);
    }
}
