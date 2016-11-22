
package view;

/**
 * Used for Adapter design pattern
 * @author thiago
 */
public class API_Twitter extends API_SocialNetwork {

    public API_Twitter(String login, String pw) {
        super(login, pw);
    }
    
    public String postOnTwitter(String login, String message) {
        if(message.length() <= 140) {
            return login + ": " + '"' + message + '"';
        } else {
            return null;
        }
    }
    
}
