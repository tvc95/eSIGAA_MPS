/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.Criador;
import business.model.Zelador;
import java.util.HashMap;
import java.util.Map;
import infra.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * This classes manages user validation
 * @author thiago
 */
public class UserManager {
    
    private Map<String, String> users = new HashMap<>();    //Collection used to store User data
    UserData file;
    
    Zelador avocadoSaver = new Zelador();       //memento
    Criador criador = new Criador();
    
    /**
     * Constructor
     */
    public UserManager() {
        file = new UserData();
        try {
            users = file.loadData();
            
        } catch (InfraException ex) {
            UserData.logger.log(Level.FINE, ex.getMessage());
        }
        
        //MEMENTO
        avocadoSaver.addMemento(criador.saveToMemento());
        criador.set(file.toString());
        
    }
    
    /**
     * Adds an user to the system
     * @param login
     * @param pw 
     * @return  
     * @throws business.control.LoginException 
     * @throws business.control.PasswordException 
     */
    public boolean addUser(String login, String pw) throws LoginException, PasswordException {
        //Login check
        if(login.length() > 20 || login.length() == 0) {
            //If login is empty or has more than 20 characters, throw an exception for invalid login
            throw new LoginException("[INVALID LOGIN]: Login must have up to 20 characters.");
        } else if (login.matches(".*[0-9].*")) {
            //If login has numbers, throw an exception (Invalid login)
            throw new LoginException("[INVALID LOGIN]: Login must not have numbers");
        }
        
        //Password check
        if(pw.length() > 12 || pw.length() < 8) {
            //Throw an exception (Invalid Password): number of characters out of permitted range.
            throw new PasswordException("[INVALID PASSWORD]: Password must have between 8 and 12 characters.");
        } else if (!(pw.matches("..*[0-9].*[0-9].*"))) {
            //Throw an exception (Invalid Password): it must have at least two numbers.
            throw new PasswordException("[INVALID PASSWORD]: Password must contain at least 2 numbers.");
        } else {
            avocadoSaver.addMemento(criador.saveToMemento());
            criador.set(file.toString());
            users.put(login, pw);
            file.saveData(users);
            return true;
        }
    }
    
    /**
     * Deletes an user
     * @param login
     * @return 
     * @throws LoginException 
     */
    public boolean delete(String login) throws LoginException{
        //Login check
        if(login.length() > 20 || login.length() == 0) {
            //If login is empty or has more than 20 characters, throw an exception for invalid login
            throw new LoginException("[INVALID LOGIN]: Login must have up to 20 characters.");
        } else if (login.matches(".*[0-9].*")) {
            //If login has numbers, throw an exception (Invalid login)
            throw new LoginException("[INVALID LOGIN]: Login must not have numbers");
        } else {
            if(searchUser(login) == null) {
                throw new LoginException("[INVALID LOGIN]: User not found.");
            } else {
                avocadoSaver.addMemento(criador.saveToMemento());
                criador.set(file.toString());
                users.remove(login);
                file.saveData(users);
                return true;
            }
        }
        
        
    }
    
    /**
     * Searches an user by its login
     * @param login
     * @return 
     */
    public String searchUser(String login) {
        Iterator itr = users.keySet().iterator();
        
        while (itr.hasNext()) {
            String userLogin = itr.next().toString();
            if(userLogin.equals(login)) {
                return userLogin;
            }
        }
        
        return null;    //if didn't find anything
    }
    
    /**
     * Gets the list of registered users
     * @return
     * @throws InfraException 
     */
    public Map<String, String> getUserList() throws InfraException {
        try{
            Map<String, String> myUsers = file.loadData();
            return myUsers;
        } catch (NullPointerException npe) {
            UserData.logger.severe(npe.getMessage());
            throw new InfraException("Persistence error. Contact the ADM or try again later.");
        }
    }
    
    public String showOldUserList(int index){
        String old = avocadoSaver.getMemento(index).toString();
        return old;
    }
    
}
