public class Imovel {
    //Qualquer tipo de imóvel possui um endereço (tipo String), um valor de aluguel (tipo double)e um percentual de taxa de administração (tipo double). 
    //O valor do aluguel e o percentual de taxade administração são utilizados para se calcular o montante devido à imobiliária pelo seu serviçode administração do imóvel.
    String endereco;
    private double valor, taxaAdm;

    //construtor da classe Imóvel
    public Imovel(String endereco, double valor, double taxaAdm){
        this.endereco = endereco;
        this.valor = valor;
        this.taxaAdm = taxaAdm;
    }

    @Override
    public String toString(){
        return "";
    }

    public int calculaValorAdmin(int valor){
        return valor * ;
    }
}
