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
public class AlunoGradPrototype extends AlunoType{
    
    protected AlunoGradPrototype(AlunoGradPrototype alunoGraduacaoPrototype){
        this.matricula = alunoGraduacaoPrototype.getMatricula();
        this.nome = alunoGraduacaoPrototype.getNome();
    }
    public AlunoGradPrototype(){
        matricula = 0;
        nome = null;
    }
    
    @Override
    public String exibirInfo() {
        return "Nome:"+nome+"\nSituação: Graduando\nMatricula:"+matricula;
    }

    @Override
    public AlunoType clonar() {
        return new AlunoGradPrototype(this);
    }
}
