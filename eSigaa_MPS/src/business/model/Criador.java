
package business.model;

/**
 * [MEMENTO DESIGN PATTERN CLASS]
 * @author Gute
 */
public class Criador {
    private String state;
    
   public void set(String state) { 
       System.out.println("Mudando de estado para: "+state);
       this.state = state; 
   }

   public Memento saveToMemento() { 
       System.out.println("Salvando Memento");
       return new Memento(state); 
   }
   public void restoreFromMemento(Memento m) {
       state = m.getSavedState(); 
       System.out.println("Estado restaurado: "+state);
   }
    
}
