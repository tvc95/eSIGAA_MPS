/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import business.model.Aluno;

/**
 *
 * [MEDIATOR DESIGN PATTERN]
 * @author thiago
 */
public interface ChatMediator {
    
    void sendMessage(String msg, Aluno a);
    
}
