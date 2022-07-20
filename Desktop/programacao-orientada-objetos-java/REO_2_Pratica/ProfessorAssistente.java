/* Classe Professor Assistente
 * por: João Almeida Barbosa Júnior
 */

//como vamos herdar da super classe Professor, devemos usar o extends
public class ProfessorAssistente extends Professor {
    int horasTrabalhadasSemana;
    double gratificacaoAtividadeExtra, salarioAssistente;

    //construtor passando os atributos da super classe Professor (além de seus próprios atributos: gratificacaoAtividadeExtra e horasTrabalhadasSemana)
    public ProfessorAssistente(String nome, String cpf, int horasTrabalhadasSemana, double gratificacaoAtividadeExtra) {
        //super como método para passar os atributos da super classe
        super(nome, cpf);
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
        this.gratificacaoAtividadeExtra = gratificacaoAtividadeExtra;
    }

    //retorna a gratificacao das atividades extras
    public double getGratificacaoAtividadeExtra() {
        return gratificacaoAtividadeExtra;
    }

    //retorna as horas trabalhadas na semana
    public int getHorasTrabalhadas() {
        return horasTrabalhadasSemana;
    }

    //calculando o salário com base no enunciado do exercício
    public double calcularSalario() {
       return salarioAssistente = (horasTrabalhadasSemana * 100) + gratificacaoAtividadeExtra;
    }
}