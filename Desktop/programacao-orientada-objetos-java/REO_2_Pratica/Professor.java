/* Classe Professor
 * por: João Almeida Barbosa Júnior
 */

public class Professor {
    String nome, cpf;

    //construtor
    public Professor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //retorna o nome
    public String getNome() {
        return nome;
    }

    //retorna o cpf
    public String getCpf() {
        return cpf;
    }

    //trecho de código retirado do PDF do exercício, usado na hora de imprimir os dados de Professor na função gerarFolhaDePagamento
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf();
    }

    //aqui eu retornei 0.0 (por ser um double) e não saber como tratar isso ainda
    //fiquei com dúvida e a dúvida foi sanada ao entrar no fórum da disciplina
    public double calcularSalario() {
        return 0.0; 
    }
}




