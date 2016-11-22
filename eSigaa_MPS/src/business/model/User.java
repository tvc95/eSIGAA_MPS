/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.io.Serializable;

/**
 *
 * @author thiago
 */
public class User implements Serializable {
    
    private static final long serialVersionUID = -3409171233621036055L;
    
    private String login;
    private String pw;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    public String toString(){
        return login + "\n" + pw;
    }
    
}
