/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

/**
 *
 * [PROXY DESIGN PATTERN]
 * @author Gute
 */
public class BancoUsuarios {
    private int quantidadeDeUsuarios;
 
    public BancoUsuarios() {
        quantidadeDeUsuarios = 0;
    }
 
    public void incrementaUsuario(){
        quantidadeDeUsuarios = quantidadeDeUsuarios+1;
    }
    public void decrementaUsuario(){
        quantidadeDeUsuarios = quantidadeDeUsuarios-1;
    }
    public String getNumeroDeUsuarios() {
        return new String("Total de usuários online: " + quantidadeDeUsuarios);
    }
 
}
