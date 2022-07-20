public abstract class Veiculo {
    private String marca;
    private String modelo;
    protected String codigo; //placa ou chassi

    public Veiculo(String codigo, String marca, String modelo){
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getCodigo(){
        return codigo;
    }

    @Override
    public String toString(){
        return "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}
