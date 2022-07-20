package Aluno;

import java.util.Scanner;

//Main
public class TesteAluno {
    public static void main(String[] args) {
        int nota;

        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o nome do aluno: ");
        aluno.nome = entrada.nextInt();

        System.out.printf("Insira a categoria do aluno (bolsista/não bolsista): ");
        aluno.categoria = entrada.nextInt();

        System.out.printf("Entre com a quantidade de disciplinas cursadas: ");
        aluno.n = entrada.nextInt();

        //insere a nota na disciplina desejada
        for(int j=1; j<=aluno.n; j++){
            System.out.printf("Insira a nota na disciplina " + j + ": ");
            nota = entrada.nextInt();
            aluno.getNota(nota);
        }
        
        System.out.printf("############# RELATÓRIO FINAL #############");
        System.out.printf("Coeficiente de Rendimento: " + aluno.getCR());
        System.out.printf("Situação final: " + aluno.getSituacao(aluno.categoria));
    }
}
