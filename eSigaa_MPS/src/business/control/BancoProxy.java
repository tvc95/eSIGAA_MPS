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
public class BancoProxy  extends BancoUsuarios{
    protected String usuario, senha;
 
    public BancoProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
 
    @Override
    public String getNumeroDeUsuarios() {
        if (temPermissaoDeAcesso()) {
            return super.getNumeroDeUsuarios();
        }
        return null;
    }
 
    private boolean temPermissaoDeAcesso() {
        return usuario == "admin" && senha == "admin";
    }
}
