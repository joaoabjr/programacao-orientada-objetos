public class Prova{
    private int nota;
    private String nomeAluno;

    public Prova(int nota, String nomeAluno){
        this.nota = nota;
        this.nomeAluno = nomeAluno;
    }
    @Override
    public String toString(){
        return "\nNome: "+ nomeAluno + "\nNota: " + nota;
    }
    public static void main(String[] args){
        Prova p = new Prova(10, "Joao");
        System.out.println(p.toString());
    }
}