/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.ArrayList;
import view.ChatMediator;

/**
 * Composite class formed by multiple Students. (Turma == AlunoComposite)
 * [COMPOSITE DESIGN PATTERN]
 * 
 * Turma will act as a concrete class for the Mediator as well
 * [MEDIATOR DESIGN PATTERN]
 * @author thiago
 */
public class Turma extends Aluno implements ChatMediator{
    
    ArrayList<Aluno> studentsList = new ArrayList<>();
    
    public Turma(String class_Name, ChatMediator mediator) {
        super(mediator);
        this.studentName = class_Name;
        this.cre = 0;
    }
    
    /**
     * Displays the information pertaining a Student.
     */
    @Override
    public void printStudent() {
        System.out.println(this.studentName);
        for(Aluno std : studentsList) {
            std.printStudent();
        }
    }
    
    /**
     * Adds a student from a class course. Adds a student into a chat room as well.
     * @param newStudent 
     */
    @Override
    public void add(Aluno newStudent) {
        this.studentsList.add(newStudent);
    }
    
    /**
     * Remove a student from a class course.
     * @param studentName
     * @param cre
     * @throws Exception 
     */
    @Override
    public void remove(String studentName, float cre) throws Exception {
        for(Aluno std: studentsList) {
            if(std.studentName.equals(studentName) && (std.cre == cre)) {
                this.studentsList.remove(std);
                return;
            }
        }
        
        throw new Exception("Student not enrolled in class or Student doesn't exist.");
    }
    
    /**
     * Implementation of the students search method within a class course.
     * @param studentName
     * @param cre
     * @return
     * @throws Exception 
     */
    @Override
    public Aluno searchStudent(String studentName, float cre) throws Exception {
        for(Aluno std: studentsList) {
            if(std.studentName.equals(studentName) && (std.cre == cre)) {
                return std;
            }
        }
        
        throw new Exception("Student not enrolled in class or Student doesn't exist.");
    }

    
    /**********************MEDIATOR METHODS (FOR CHAT FUNCTIONALITY)************************/
    /**
     * This method deals with message reception between a class
     * chat room.
     * @param msg 
     */
    @Override
    public void receiveMsg(String msg) {
        System.out.println(this.studentName + " received " + msg);
    }

    /**
     * This method deals with sending messages to other students (colleagues)
     * in a class chat room.
     * @param msg
     * @param a 
     */
    @Override
    public void sendMessage(String msg, Aluno a) {
        for(Aluno std : studentsList) {
            if(std != a) {
                std.receiveMsg(msg);
            }
        }
    }

    
}
