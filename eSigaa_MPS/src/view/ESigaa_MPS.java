package view;

import business.control.BancoProxy;
import business.control.BancoUsuarios;
import business.control.LoginException;
import business.control.PasswordException;
import business.control.UserManager;
import infra.InfraException;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;


/**
 * Main class
 * @author thiago
 */
public class ESigaa_MPS {
    
    UserManager manager = new UserManager();
    BancoUsuarios banco;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        showUI();
        
    }
    
    public static void showUI(){
        String op = JOptionPane.showInputDialog("Bem-vindo ao e-SIGAA. Selecione a opção desejada:" +
                                                "\n\t1 - Cadastrar Usuário" +
                                                "\n\t2 - Listar Usuários" +
                                                "\n\t3 - Excluir Usuário" +
                                                "\n\t4 - Rever Lista de Usuários antiga"+
                                                "\n\t5 - Sair", "Sua opção");
        
        ESigaa_MPS main = new ESigaa_MPS();
        main.readInput(op);
    }
    
    public void readInput(String option){
        int op = Integer.parseInt(option);
        boolean checkLogin = false, checkPw = false;
        
        switch(op) {
            case 1:
                while(true){
                    String login = "";
                    String pw = "";
                    if(!checkLogin) {
                        login = JOptionPane.showInputDialog("Insira o login do usuário:");
                    } 
                    if(!checkPw) {
                        pw = JOptionPane.showInputDialog("Insira a senha:");
                    }
                    
                    try {
                        this.manager.addUser(login, pw);
                        banco = new BancoProxy(login,pw);
                        banco.incrementaUsuario();
                        banco = new BancoProxy("admin", "admin");
                        System.out.println(banco.getNumeroDeUsuarios());
                        JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
                        checkLogin = true;
                        checkPw = true;
                        break;
                    } catch (LoginException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        login = "";
                        pw = "";
                        checkLogin = false;
                    } catch (PasswordException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        login = "";
                        pw = "";
                        checkPw = false;
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "[ERRO]: Campo(s) vazio(s). Preencha todos os campos!");
                        break;
                    }
                }
                showUI();
                break;
                
            case 2:
                String users = "";
                Iterator<Map.Entry<String, String>> usrlist;
                try{
                    usrlist = this.manager.getUserList().entrySet().iterator();
                    
                    while(usrlist.hasNext()){
                        Map.Entry<String, String> nxtuser = usrlist.next();
                        users = users + "[Login: " + nxtuser.getKey() + "\t | \tSenha: " + nxtuser.getValue() + "]\n";
                    }
                    JOptionPane.showMessageDialog(null, users);
                } catch (InfraException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                showUI();
                break;
                
            case 3:
                String usrlogin = "";
                if(!checkLogin){
                    usrlogin = JOptionPane.showInputDialog("Insira o login do usuário:");
                }
                
                try{
                    this.manager.delete(usrlogin);
                    banco.decrementaUsuario();
                    banco = new BancoProxy("admin", "admin");
                    System.out.println(banco.getNumeroDeUsuarios());                    
                    JOptionPane.showMessageDialog(null, "O usuário foi removido com sucesso");
                    checkLogin = true;
                } catch (LoginException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    usrlogin = "";
                    checkLogin = false;
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "[ERRO]: Campo vazio. Preencha o campo com um login de usuário!");
                    break;
                }
                showUI();
                break;
                
            case 4:
                try{
                    String i = JOptionPane.showInputDialog("Insira a quantas interações você deseja voltar");
                    int index = Integer.parseInt(i);
                    String memento = this.manager.showOldUserList(index);
                    JOptionPane.showMessageDialog(null, memento);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"[ERRO]: Interação não disponível");
                }
            
            case 5:
                System.exit(5);
                
            default:
                JOptionPane.showMessageDialog(null, "Comando inválido!");
                showUI();
                break;
        }
    }
    
}
