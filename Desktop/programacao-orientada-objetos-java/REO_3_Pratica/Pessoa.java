public abstract class Pessoa implements Imposto{ //na ativa e aposentado
    protected String cpf;
    protected String nome;

    //construtor Pessoa
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    //como o imposto vai ser calculado nas subclasses, o método torna-se abstrato e não necessita retornar nada aqui
    @Override
    public abstract double getImpostoPago();
}
