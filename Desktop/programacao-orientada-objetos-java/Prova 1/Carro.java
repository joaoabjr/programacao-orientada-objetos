public class Carro extends Veiculo{
    private int numeroPortas;
    
    public Carro(String placa, int numeroPortas, String marca, String modelo){
        super(placa, marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString(){
        return super.toString() + "\nPlaca: " + codigo + "\nNumero de portas: " + numeroPortas + "\n"; 
    }
}
