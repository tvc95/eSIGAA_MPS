package business.control;

import infra.InfraException;
import java.util.Map;

/**
 * Facade class for users management.
 * @author thiago
 */
public class FacadeManager {
    //Creation of Singleton object
    private static FacadeManager uniqueInstance = null;
    
    //Facade
    private ReportManager reportMng = null;
    private UserManager userMng = null;
    
    public static FacadeManager getInstance(ReportManager reportMng, UserManager userMng) {
        //Singleton
        if(uniqueInstance == null) {
            uniqueInstance = new FacadeManager(reportMng, userMng);
        }
        return uniqueInstance;
    }
    
    //Singleton
    private FacadeManager(ReportManager reportMng, UserManager userMng){
        this.reportMng = reportMng;
        this.userMng = userMng;
    }
    
    
    //other methods
    public boolean addNewUser(String login, String pw) throws LoginException, PasswordException {
        return userMng.addUser(login, pw);
    }
    
    public boolean deleteUser(String login) throws LoginException{
        return userMng.delete(login);
    }
    
    public String search(String login) {
        return userMng.searchUser(login);
    }
    
    public Map<String, String> getUsers() throws InfraException {
        return userMng.getUserList();
    }
    
    
}
