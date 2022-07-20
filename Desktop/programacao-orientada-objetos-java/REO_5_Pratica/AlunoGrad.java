/* Classe Aluno
 * feito por: João Almeida Barbosa Júnior - 201820285
 */

public class AlunoGrad extends Aluno {
    private int notaTrabalhoPratico;

    //construtor herdando atributos da superclasse
    public AlunoGrad(int notaTrabalhoPratico, String nome, int notaProva, int qtdFaltas){
        super(notaProva, nome, qtdFaltas);
        this.notaTrabalhoPratico = notaTrabalhoPratico;
    }

    //pega a nota do trabalho prático do aluno
    public int getNotaTrabalhoPratico(){
        return notaTrabalhoPratico;
    }
    
    //para que um aluno da graduação seja aprovado na disciplina ele precisa obter nota média: 
    //(média aritmética simples das notas da prova e trabalho prático) maior ou igual a 60 e  quantidade defaltas inferior a 19. - Trecho retirado do arquivo PDF.
    public String verificaAprovacao(){
        final double media = (getNotaTrabalhoPratico() + getNotaProva()) / 2;

        if (media >= 60 && getQtdFaltas() < 19){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }

}
