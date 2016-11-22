/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Adapter for twitter integration with SIGAA
 * @author thiago
 */
public class TwitterAdapter extends API_Twitter implements TwitterTarget {

    public TwitterAdapter(String login, String pw) {
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
    public String postOnTwitter(String login, String message){
        return postOnTwitter(login, message);
    }
    
}
