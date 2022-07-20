import java.util.ArrayList;
import java.util.List;

public class Gerenciadora {
    private List<UsuarioBib> usuarios;

    public Gerenciadora() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(UsuarioBib ub) {
        usuarios.add(ub);
    }

    public String solicitarEmprestimo(UsuarioBib ub, String tituloLivro) {
        if (usuarios.contains(ub)) {
            return ub.realizarEmprestimo(tituloLivro);
        }
        return "\nUsuario nao cadastrado!";
    }
}