import java.util.*;

public class TesteMain {
    public static void main(String[] args){
        //arraylist do tipo imposto (que une todas as classes que utilizam o método getImpostoPago - carro, pessoa e seus filhos)
        ArrayList<Imposto> array = new ArrayList<Imposto>();

        //valor do veículo e aliquota do imposto sobre o veículo
        Carro carro1 = new Carro(20000, 3);
        array.add(carro1);

        //cpf, nome, salário mensal e valor pago de inss (para ser descontado do salário e assim realizar o cálculo de IR)
        Pessoa ativa1 = new NaAtiva("09872182987", "Joao", 2000, 200);
        array.add(ativa1);

        //cpf, nome, idade do aposentado e valor recebido da aposentadoria
        Pessoa aposentada1 = new Aposentada("08786456679", "Paulo", 70, 2000);
        array.add(aposentada1);

        //iterador do tipo imposto, iterando sobre o array
        for(Imposto itr: array){
            System.out.println(itr);
        }
    }
}
