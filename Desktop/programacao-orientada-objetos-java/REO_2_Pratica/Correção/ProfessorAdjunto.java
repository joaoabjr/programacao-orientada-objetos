/* Classe Professor Adjunto
 * por: João Almeida Barbosa Júnior
 */

//como vamos herdar da super classe Professor, devemos usar o extends 
public class ProfessorAdjunto extends Professor {
    double gratificacaoTitulacao, salarioBase, salarioAdjunto;//Erro: modificador de visibilidade //Erro: atributo desnecessário

    //construtor passando os atributos da super classe Professor (além de seus próprios atributos: gratificacaoTitulacao e salarioBase)
    public ProfessorAdjunto(String nome, String cpf, double gratificacaoTitulacao, double salarioBase) {
        //super como método para passar os atributos da super classe
        super(nome, cpf);
        this.gratificacaoTitulacao = gratificacaoTitulacao;
        this.salarioBase = salarioBase;
    }

    //retorna a gratificação
    public double gratificacaoTitulacao() {//Obs.: Qual utilidade?
        return gratificacaoTitulacao;
    }

    //retorna o salário base
    public double getSalarioBase() {//Obs.: Qual utilidade?
        return salarioBase;
    }

    //calcula o salário com base no enunciado do exercício
    public double calcularSalario() {
        return salarioAdjunto = 1.3 * (gratificacaoTitulacao + salarioBase);//Erro: Para que serve salarioAdjunto?
    }
}
