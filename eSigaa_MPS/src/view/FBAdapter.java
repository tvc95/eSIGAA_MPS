
package view;

/**
 * Adapter for Facebook integration with SIGAA
 * @author thiago
 */
public class FBAdapter extends API_Facebook implements FBTarget{

    public FBAdapter(String login, String pw) {
        super(login, pw);
    }

    @Override
    public void vinculateAccount(String sigaalogin, String sigaapw) {
        vinculateAccount(sigaalogin, sigaapw);
    }

    @Override
    public void notifyUpdate(String usrlogin, String post) {
        notifyUpdate(usrlogin, post);
    }
    
    @Override
    public String postOnFB(String login, String message) {
        return postOnFB(login, message);
    }
}
