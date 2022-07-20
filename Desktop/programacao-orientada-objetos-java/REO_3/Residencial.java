public class Residencial extends Imovel{
    //além   disso,   um   imóvel   residencial   é   caracterizado   pelo   CPF   de   seu   proprietário   (tipoString) e pela sua categoria (tipo String), 
    //a qual pode ser “local” (quando o imóvel se localiza namesma cidade da imobiliária) ou “regional” (quando o imóvel se localiza em cidades vizinhas à da imobiliária).
    private String cpf, categoria; //categoria: local ou regional

    public Residencial(String endereco, double valor, double taxaAdm, String cpf, String categoria){
        super(endereco, valor, taxaAdm);
        this.cpf = cpf;
        this.categoria = categoria;
    }

    public String getCpf(){
        return cpf;
    }

    public String getCategoria(){
        return categoria;
    }

    //(R$ 50,00 para imóvellocal   e   R$   100,00   para   imóvel   regional) 
    public int calculaValorAdmin(int valor){
        
        return valor * ;
    }
}
