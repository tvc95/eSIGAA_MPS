/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class deals with data persistence.
 * @author thiago
 */
public class UserData {
    
    public static Logger logger = Logger.getLogger(UserData.class.getName());
    
    /**
     * Constructor
     */
    public UserData() {
        try {
            Handler handleConsole = new ConsoleHandler();
            Handler handleFile = new FileHandler("log.txt");
            
            handleConsole.setLevel(Level.OFF);
            handleFile.setLevel(Level.OFF);
            
            UserData.logger.addHandler(handleConsole);
            UserData.logger.addHandler(handleFile);
            UserData.logger.setUseParentHandlers(false);
            
        } catch (IOException ioe) {
            logger.severe("Error in the file during program execution.");
        }
    }
    
    /**
     * Save users data
     * @param users 
     */
    public void saveData(Map<String, String> users) {
        File f = new File("usrdata.bin");
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
            out.writeObject(users);
            out.close();
            
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Load users data
     * @return 
     */
    public Map<String, String> loadData() throws InfraException {
        Map<String, String>  users = new HashMap<>();
        File f = new File("usrdata.bin");
        ObjectInputStream objInput = null;
        InputStream in = null;
        
        if(!f.exists()) {
            saveData(users);
        }
        
        try {
            in = new FileInputStream(f);
            objInput = new ObjectInputStream(in);
            users = (Map<String, String>) objInput.readObject();
            return users;
            
            
        } catch (NullPointerException | IOException | ClassNotFoundException ex) {
            logger.config(ex.getMessage());
            throw new InfraException("Erro de persistência. Contate o administrador ou tente mais tarde.");  
        } finally {
            try {
                objInput.close();
                in.close();
                
            } catch (IOException ioe) {
                logger.severe(ioe.getMessage());
            }
        }
    }
    
}
