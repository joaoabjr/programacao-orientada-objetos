public class Comercial extends Imovel{
    private String cnpj;
    private int duracao, contrato; //duração (em meses) do contrato de locação (tipo int).

    public Comercial(String endereco, double valor, double taxaAdm, String cpf, String categoria, String cnpj, int duracao, int contrato){
        //recebendo atributos da super classe 
        super(endereco, valor, taxaAdm);
        this.cnpj = cnpj;
        this.duracao = duracao;
        this.contrato = contrato;
    }

    public int calculaValorAdmin(){
        return pepino;
    }
}
