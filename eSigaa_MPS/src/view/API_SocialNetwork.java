package view;

/**
 * Used for Adapter design pattern
 * @author thiago
 */
public class API_SocialNetwork {
    private String login, pw;
    
    /**
     * Constructor
     * @param login
     * @param pw 
     */
    public API_SocialNetwork(String login, String pw){
        this.login = login;
        this.pw = pw;
        
    }
    
    /**
     * This method vinculates the user's SIGAA account with a social network account
     * @param sigaalogin
     * @param sigaapw 
     */
    public void vinculateAccount(String sigaalogin, String sigaapw) {
        System.out.println("Connecting to services...");
        System.out.println("Vinculating account...");
        System.out.println("SIGAA account " + sigaalogin + " successfully vinculated with social network account!");
    }
    
    /**
     * This method notifies the user of a post update (comments, edits, etc.)
     * @param usrlogin
     * @param post
     */
    public void notifyUpdate(String usrlogin, String post) {
        System.out.println("You have a new notification!");
        System.out.println("Your post: " + '"' + post + '"' + " received an update.");
    }
}
