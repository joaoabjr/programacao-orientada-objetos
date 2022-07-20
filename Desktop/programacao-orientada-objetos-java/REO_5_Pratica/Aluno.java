/* Classe Aluno
 * feito por: João Almeida Barbosa Júnior - 201820285
 * REO 5
 */

//como temos um método abstrato, a classe também deve se tornar abstrata,
//e também para evitar que seja instanciado um objeto do tipo Aluno (o que não faz sentido e nem necessidade)
//o implements Comparable do tipo <Aluno> aparece para ser usado no método sort do Collections (para ordenar decrescentemente a nossa lista de alunos por nota)
//retirado de: https://www.youtube.com/watch?v=e8zWALRr0Ro&ab_channel=BLSoftSimplesmenteJava
public abstract class Aluno implements Comparable<Aluno>{
    private String nome;
    private int notaProva, qtdFaltas;

    //construtor
    public Aluno(int notaProva, String nome, int qtdFaltas){
        this.notaProva = notaProva;
        this.nome = nome;
        this.qtdFaltas = qtdFaltas;
    }

    //pega a nota da prova do aluno
    public int getNotaProva(){
        return notaProva;
    }   

    //pega o nome do aluno
    public String getNome(){
        return nome;
    }

    //pega a quantidade de faltas do aluno
    public int getQtdFaltas(){
        return qtdFaltas;
    }

    //formatei o toString() dessa forma para poder imprimir na tela igual no PDF do exercício
    //terminando a formatação na função gerarDiarioTurma()
    //obrigado pela ajuda, Professor!
    @Override
    public String toString(){
        return String.format("%-10s %-12s %-8s %-10s", getNome(), getNotaProva(), getQtdFaltas(), verificaAprovacao());
    }

    //como o método de aprovação estará presente nas duas subclasses (e ambos são diferentes),
    //tornamos esse método abstrato, para que assim sejam tratados somente nas subclasses
    public abstract String verificaAprovacao();

    //sobrescrevendo um método do Java Util que será usado para comparação de notas (compara dois alunos, o atual e o próximo)
    @Override
    public int compareTo(Aluno aluno){
        return (aluno.getNotaProva() - this.notaProva);
    }
}