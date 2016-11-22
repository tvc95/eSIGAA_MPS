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
public class AlunoMestradoPrototype extends AlunoType{
    
    protected AlunoMestradoPrototype(AlunoMestradoPrototype alunoMestradoPrototype){
        this.matricula = alunoMestradoPrototype.getMatricula();
        this.nome = alunoMestradoPrototype.getNome();
    }
    public AlunoMestradoPrototype(){
        matricula = 0;
        nome = null;
    }
    
    @Override
    public String exibirInfo() {
        return "Nome:"+nome+"\nSituação: Mestrando\nMatricula:"+matricula;
    }

    @Override
    public AlunoType clonar() {
        return new AlunoMestradoPrototype(this);
    }
    
}
