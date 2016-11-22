/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * [PROTOTYPE DESIGN PATTERN]
 * @author Gute
 */
public abstract class AlunoType {       //Prototype design pattern
    protected int matricula;
    protected String nome;
    public abstract String exibirInfo();
    public abstract AlunoType clonar();
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
