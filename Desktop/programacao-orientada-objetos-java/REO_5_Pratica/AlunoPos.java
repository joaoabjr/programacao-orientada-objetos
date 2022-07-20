/* Classe AlunoPos (pós graduação)
 * feito por: João Almeida Barbosa Júnior - 201820285
 */

public class AlunoPos extends Aluno {
    private int qtdSeminarios;

    public AlunoPos(int qtdSeminarios, String nome, int notaProva, int qtdFaltas){
        super(notaProva, nome, qtdFaltas);
        this.qtdSeminarios = qtdSeminarios;
    }

    public int getQtdSeminarios(){
        return qtdSeminarios;
    }

    //para um aluno da pós-graduação obter aprovação na disciplina, ele precisa ter apresentado pelo menos dois seminários, 
    //ter obtido nota na prova maior ou igual a 70 e ter no máximo 15 faltas - Trecho retirado do arquivo PDF.
    public String verificaAprovacao(){
        if (getQtdSeminarios() >= 2 && getNotaProva() >= 70 && getQtdFaltas() <= 15){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }

}
