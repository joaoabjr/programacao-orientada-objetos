public interface UsuarioBib {
    //usuario bib passa a ser uma interface para que aluno externo também faça seu uso (usar o realizarEmprestimo)
    //assim, as classes restantes que a estendiam passam a estender MembroUniversidade, já que UsuarioBib estendia dessa classe
    public abstract String realizarEmprestimo(String tituloLivro);
}