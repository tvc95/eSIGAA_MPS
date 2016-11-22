/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

/**
 *
 * @author thiago
 */
public class InfraException extends Exception {
    
    private static final long serialVersionUID = -4176717944228612029L;
    
    //Default Constructor
    public InfraException(){}

    //Exception Constructor
    public InfraException(String message) {
	super(message);
    }
    
}
