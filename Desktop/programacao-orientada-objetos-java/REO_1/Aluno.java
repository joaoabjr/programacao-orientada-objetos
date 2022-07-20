package TesteAluno;
import java.util.Scanner;


public class Aluno{
    String nome, categoria;
    int n, notas[],  numDisciplina;

    //Construtor da classe Aluno
    public Aluno(String nome, String categoria, int n){
        this.nome = nome;
        this.categoria = categoria;
        this.n = n;
    }

    //Função para retornar o nome do aluno
    public String getNome(){
        return nome;
    }

    //Função para retornar a nota do aluno em determinada disciplina (a variável vai receber o valor do notas[i])
    public void getNota(int nota){
        for(int j=1; j<=n; j++){
            notas[j] = nota;
        }
    }

    //Função para retornar o coeficiente de rendimento do aluno (média aritmética das notas de todas disciplinas cursadas)
    public float getCR(){
        float soma = 0;

        for(int i=0; i<n; i++){
            soma = soma + notas[i];
        }
        return soma/n;
    }


    //Função para retornar a situação final do aluno
    public String getSituacao(String categoria){
        if(categoria == "bolsista" && getCR() > 75){
            return "Regular";
        }
        else if(categoria == "não bolsista" && getCR() > 70){
            return "Regular";
        }
        else{
            return "Desligado";
        }
    }
}