/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author wilson
 */
public class ExceptionValores extends Exception{
    
    
    public ExceptionValores(){
        super();
    }
    
    public ExceptionValores(String mensaje){
        super(mensaje);
    }
    
   public String getException(){
       return this.getMessage();
   }
    
}
