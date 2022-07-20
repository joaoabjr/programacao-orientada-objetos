/* Classe Diário 
 * feito por: João Almeida Barbosa Júnior - 201820285
 */

import java.util.*;

public class Diario{
    private ArrayList<Aluno> diario;

    //construtor inicializando o ArrayList que conterá os alunos
    public Diario(){
        diario = new ArrayList<Aluno>();
    }

    //adiciona o aluno passado no parâmetro ao ArrayList de alunos
    public void adicionarAluno(Aluno a){
        diario.add(a);
    }
    
    //imprimindo o ArrayList de alunos, utilizando o toString com override da classe Aluno
    public void gerarDiarioTurma(){
        //print para identificar as colunas e seus respectivos valores sendo imprimidos no for (com o método sobrescrito do toString)
        System.out.printf("%-10s %-12s %-8s %-10s %n", "Nome", "Nota Prova", "Faltas", "Situacao");

        //ordenando decrescentemente o ArrayList diário
        Collections.sort(diario);
       
        for(Aluno a: diario){
            System.out.println(a);
        }
    }
}
