/* Classe Professor
 * por: João Almeida Barbosa Júnior
 */

import java.util.*;

public class Departamento {
    String nome, faculdade;
    //criando um ArrayList para guardar os professores
    ArrayList<Professor> professores;

    //construtor
    public Departamento(String nome, String faculdade) {
        this.nome = nome;
        this.faculdade = faculdade;
        professores = new ArrayList(); //inicializando o ArrayList
    }

    //função para contratar professor (adicionar no vetor de professores)
    public void contratarProfessor(Professor professor) {
        //adicionando um professor no vetor de professores
        professores.add(professor);
    }

    //trecho de código retirado do PDF do exercício - assim como o nome sugere, ele gera a folha de pagamento de acordo com o cargo do professor
    public void gerarFolhaDePagamento() {
        for(Professor p: professores) {
            System.out.println(p);
            System.out.printf("Salário = R$ %.2f \n",p.calcularSalario());
            System.out.println();
        }
    }
}