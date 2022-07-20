public class TesteDepartamento {
 public static void main(String[] args) {
    Departamento depto = new Departamento("Ciencia da Computacao","Informatica");
    Professor prof1 = new ProfessorAdjunto("Luiz","123456789-10",3000.00,2500.00);
    Professor prof2 = new ProfessorAssistente("José", "987654321-00", 40, 1500.00);

   //criei um prof 3 aqui para testar se está inserindo corretamente no vetor de professores! //OK
    Professor prof3 = new ProfessorAssistente("Fatima", "123454321-90", 50, 2000.00);

    depto.contratarProfessor(prof1);
    depto.contratarProfessor(prof2);
    depto.contratarProfessor(prof3);

    depto.gerarFolhaDePagamento();
   }
}
