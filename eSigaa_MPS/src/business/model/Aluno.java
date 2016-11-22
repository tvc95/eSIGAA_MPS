
package business.model;

import view.ChatMediator;

/**
 * Component class containing the interface for all Aluno objects.
 * [COMPOSITE DESIGN PATTERN CLASS]
 * 
 * This class also defines what protocol will be used to send the message
 * to its peers. [Colleague element from the Mediator design pattern class]
 * [MEDIATOR DESIGN PATTERN CLASS]
 * @author thiago
 */
public abstract class Aluno extends User{
    protected ChatMediator mediator;    //mediator
    String studentName;
    float cre;
    
    /**
     * Constructor. Used in Mediator design pattern.
     * @param mediator 
     */
    public Aluno(ChatMediator mediator) {
        this.mediator = mediator;
    }
    
    /**
     * Sends a message via chat. The mediator will act redirecting
     * the message to the receiver.
     * @param msg 
     */
    public void sendMessage(String msg) {
        mediator.sendMessage(msg, this);
    }
    
    /**
     * Deals with message reception.
     * @param msg 
     */
    public abstract void receiveMsg(String msg);

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @return the cre
     */
    public float getCre() {
        return cre;
    }
    
    /**************methods used in the composite design pattern****************/
    public void printStudent() {
        System.out.println(this.studentName + "\n" + this.cre);
    }

    public void add(Aluno newStudent) throws Exception {
        throw new Exception("Error: can't add a student in another student. Not a composite class");
    }
    
    public void remove(String studentName, float cre) throws Exception {
        throw new Exception("Error: can't remove a student. Not a composite class");
    }
    
    public Aluno searchStudent(String studentName, float cre) throws Exception {
        throw new Exception("Error: can't search a student. Not a composite class");
    }
    
}
