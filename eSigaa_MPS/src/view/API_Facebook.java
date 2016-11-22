
package view;

/**
 * Used for Adapter design pattern
 * @author thiago
 */
public class API_Facebook extends API_SocialNetwork {

    /**
     * Constructor
     * @param login
     * @param pw 
     */
    public API_Facebook(String login, String pw) {
        super(login, pw);
    }
    
    /**
     * 
     * @param login
     * @param message
     * @return 
     */
    public String postOnFB(String login, String message) {
        return login + ": " + '"' + message + '"';
    }
    
}
