public class Carro implements Imposto{ 
    private double valor, aliquota;
    
    public Carro(int valor, double aliquota){
        this.valor = valor;
        this.aliquota = aliquota;
    }

    //para realizar o cálculo, basta que você multiplique o valor venal do veículo pela alíquota devida e divida o valor por 100
    @Override
    public double getImpostoPago(){
        return (valor*aliquota)/100;
    }

    @Override
    public String toString(){
        return "\nValor: " +  valor + "\nAliquota do imposto: " + aliquota + "\nValor a ser pago no imposto: " + getImpostoPago();
    }
}
