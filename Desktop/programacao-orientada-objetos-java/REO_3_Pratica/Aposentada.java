public class Aposentada extends Pessoa{
    //valor mensal da aposentadoria e a idade do aposentado
    private int valorAposentadoria, idade;

    //construtor herdando cpf e nome da superclasse Pessoa
    public Aposentada(String cpf, String nome, int idade, int valorAposentadoria){
        super(cpf, nome);
        this.idade = idade;
        this.valorAposentadoria = valorAposentadoria;
    }

    //aqui eu simulei o imposto da seguinte forma: quanto maior a idade do contribuinte, 
    //menos ele vai pagar no seu imposto de renda (multiplicando a idade por 3 e diminuindo no valor total da aposentadoria * aliquota fixa de 7.5% (0.075))
    @Override
    public double getImpostoPago(){
        return (valorAposentadoria - (idade * 3)) * 0.075;
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\nCPF: " + cpf + "\nIdade do aposentado: " + idade + 
        "\nValor recebido na aposentadoria: " + valorAposentadoria + "\nValor pago no imposto de renda mensal: " + getImpostoPago();
    }
}
