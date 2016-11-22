/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

/**
 * Handles errors regarding password input
 * @author thiago
 */
public class PasswordException extends Exception{
    
    //Default constructor
    public PasswordException(){}
    
    /**
     * Exception constructor 
     * @param message 
     */
    public PasswordException(String message){
        super(message);
    }
}
