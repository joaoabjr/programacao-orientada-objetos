public class Professor extends MembroUniversidade implements UsuarioBib {
    private String categoria;

    public Professor(String id, double salario, String categoria) {
        super(id, salario);
        this.categoria = categoria;
    }

    @Override
    public String realizarEmprestimo(String tituloLivro) {
        if (categoria.equals("20H")) {
            return "\nUsuario:" + getIdFuncionario() + "\nLivro " + tituloLivro + "emprestado por 3 dias!";
        }
        return "\nUsuario:" + getIdFuncionario() + "\nLivro " + tituloLivro + "emprestado por 7 dias!";

    }
}