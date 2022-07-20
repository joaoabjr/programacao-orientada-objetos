public class AlunoExterno implements UsuarioBib {
    private String cpf;

    public AlunoExterno(String cpf) {
        this.cpf = cpf;
    }

    //sobreescrevendo o método realizarEmprestimo, já que esse método funciona diferente para alunos externos
    @Override
    public String realizarEmprestimo(String tituloLivro) {
        return "\nUsuario:" + cpf + "\nLivro " + tituloLivro + "emprestado por 4 dias!";
    }
}
