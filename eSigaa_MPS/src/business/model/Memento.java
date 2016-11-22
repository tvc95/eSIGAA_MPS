/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 * [MEMENTO DESIGN PATTERN CLASS]
 * @author Gute
 */
public class Memento {
    private String state;

   public Memento(String stateToSave) {
       state = stateToSave;
   }
   public String getSavedState() { 
       return state;
   }
    
}
