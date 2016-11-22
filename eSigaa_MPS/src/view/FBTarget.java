/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author thiago
 */
public interface FBTarget extends SocialNetworkTarget{
    String postOnFB(String login, String message);
}
