public class NaAtiva extends Pessoa{
    //salário que recebe no mês e valor descontado de inss
    private int salarioMensal, inss;

    //construtor herdando cpf e nome da superclasse Pessoa
    public NaAtiva(String cpf, String nome, int salarioMensal, int inss){
        super(cpf, nome);
        this.salarioMensal = salarioMensal;
        this.inss = inss;
    }

    @Override
    public double getImpostoPago(){
        double aliquota;

        //se o salário mensal for menor que 2000, a aliquota do imposto é igual a 5% (5.0 vai ser divido por 100 lá no return)
        if(salarioMensal < 2000){
            aliquota = 5.0;
        }
        //se o salário mensal for maior ou igual que 2000 e menor que 3000, a aliquota do imposto é igual a 10% (10.0 vai ser divido por 100 lá no return)
        else if(salarioMensal >= 2000 && salarioMensal < 3000){
            aliquota = 10.0;
        }
        //se o salário mensal for menor que 2000, a aliquota do imposto é igual a 15% (5.0 vai ser divido por 100)
        else{
            aliquota = 15.0;
        }
        //o inss é descontado do total do salário mensal e multiplicado pela aliquota (dividido por 100 para representar porcentagem)
        return (salarioMensal-inss)*(aliquota/100);
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\nCPF: " + cpf + "\nSalario mensal: " + salarioMensal + "\nINSS: " + inss + "\nValor pago no imposto de renda mensal: " + getImpostoPago();
    }
}