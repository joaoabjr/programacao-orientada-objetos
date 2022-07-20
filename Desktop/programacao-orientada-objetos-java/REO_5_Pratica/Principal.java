/* Classe Principal
 * feito por: João Almeida Barbosa Júnior - 201820285
 */

public class Principal {
    public static void main(String[] args){
        Diario diario = new Diario();
        Aluno a;
        
        //nota do trabalho prático, nome do aluno, nota da prova e quantidade de faltas
        a = new AlunoGrad(90,"Jose",85,12);
        diario.adicionarAluno(a);

        //nota do trabalho prático, nome do aluno, nota da prova e quantidade de faltas
        a = new AlunoGrad(65,"Pedro",45,10);
        diario.adicionarAluno(a);

        //qtd de seminários, nome do aluno, nota da prova e quantidade de faltas
        a = new AlunoPos(3,"Regina",75,15);
        diario.adicionarAluno(a);

        diario.gerarDiarioTurma();
    }
}
