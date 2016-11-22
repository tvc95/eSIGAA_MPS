/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

/**
 *
 * @author thiago
 */
public class LoginException extends Exception{
    
    //Default constructor
    public LoginException(){}
    
    /**
     * Exception constructor
     * @param message 
     */
    public LoginException(String message){
        super(message);
    }
}
