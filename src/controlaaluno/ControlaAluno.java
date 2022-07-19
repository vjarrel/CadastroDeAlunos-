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
    
    public boolean salvarDados(Aluno alunos){
        if(alunos != null){
            this.alunos.add(alunos);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Aluno> retornarDados(){
        return alunos;
    }
}
