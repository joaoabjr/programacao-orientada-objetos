public class Tecnico extends MembroUniversidade implements UsuarioBib {
    private String classe;

    public Tecnico(String id, double salario, String classe) {
        super(id, salario);
        this.classe = classe;
    }

    @Override
    public String realizarEmprestimo(String tituloLivro) {
        if (classe.equals("C")) {
            return "\nUsuario:" + getIdFuncionario() + "\nLivro " + tituloLivro + "emprestado por 2 dias!";
        }
        return "\nUsuario:" + getIdFuncionario() + "\nLivro " + tituloLivro + "emprestado por 5 dias!";

    }
}