public class Caminhao extends Veiculo{
    private int numeroEixos;

    public Caminhao(String chassi, int numeroEixos, String marca, String modelo){
        super(chassi, marca, modelo);
        this.numeroEixos = numeroEixos;
    }

    @Override
    public String toString(){
        return super.toString() + "\nChassi: " + codigo + "\nNumero de Eixos: " + numeroEixos + "\n";
    }
}
