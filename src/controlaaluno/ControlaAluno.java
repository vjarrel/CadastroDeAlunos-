/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaaluno;

import construtoraluno.Aluno;
import java.util.ArrayList;

/**
 *
 * @author JuanP
 */
public class ControlaAluno {
    
    private ArrayList<Aluno> alunos = new ArrayList();
    
    public boolean salvarDados(Aluno alunos, int pos){
        if(matriculaIgual(alunos)){
            if(alunos != null && pos == 3){
                this.alunos.add(3, null);
                this.alunos.add(3, alunos);
                return true;
            }else{
                this.alunos.add(alunos);
                return true;
            }
        }
        return false;
    }
    
    public boolean matriculaIgual(Aluno alunos){
        for(int i=0; i < this.alunos.size();i++){
            if(alunos.getMatricula().equals(this.alunos.get(i).getMatricula())){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Aluno> retornarDados(){
        return alunos;
    }
}
