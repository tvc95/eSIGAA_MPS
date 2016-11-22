/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.ArrayList;

/**
 * [MEMENTO DESIGN PATTERN CLASS]
 * @author Gute
 */
public class Zelador {
   private ArrayList<Memento> savedStates = new ArrayList<Memento>();

   public void addMemento(Memento m) { 
       savedStates.add(m); 
   }
   public Memento getMemento(int index) { 
       return savedStates.get(index); 
   }
}
