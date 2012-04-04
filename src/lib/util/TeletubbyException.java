/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.util;

/**
 * 
 * @author samis
 */
public class TeletubbyException extends RuntimeException {

    /**
     * 
     * Creates a new instance of <code>TeletubbyException</code> without detail message.
     */
    public TeletubbyException() {
    }

    /**
     * Constructs an instance of <code>TeletubbyException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public TeletubbyException(String msg) {
        super(msg);
    }
}
