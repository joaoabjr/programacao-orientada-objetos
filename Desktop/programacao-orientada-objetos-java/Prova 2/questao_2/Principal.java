public class Principal {
    public static void main(String args[]) {
        Gerenciadora g = new Gerenciadora();
        UsuarioBib ub;
        ub = new Professor("1.234.567", 9000, "40HDE");
        g.cadastrarUsuario(ub);
        System.out.println(g.solicitarEmprestimo(ub, "Aprendendo POO"));
        ub = new Tecnico("745DF", 5000, "B");
        g.cadastrarUsuario(ub);
        System.out.println(g.solicitarEmprestimo(ub, "Tecnicas de Administracao"));
        ub = new AlunoExterno("987.654.321-00");
        g.cadastrarUsuario(ub);
        System.out.println(g.solicitarEmprestimo(ub, "Matematica Basica"));
    }
}