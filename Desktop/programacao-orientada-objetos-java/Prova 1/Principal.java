public class Principal {
    public static void main(String[] args){
        Gerenciador g = new Gerenciador();
        Carro carro; 
        Caminhao caminhao;
        //Veiculo v = new Veiculo();

        //placa, numeroPortas, marca, modelo
        carro = new Carro("ENT-8743", 4, "VW", "Fusca");
        g.insereVeiculo(carro);

        //placa, numeroPortas, marca, modelo
        carro = new Carro("JPL-9876", 2, "Ford", "Ka");
        g.insereVeiculo(carro);

        //placa, numeroPortas, marca, modelo
        carro = new Carro("KLM-0123", 4, "Fiat", "Uno");
        g.insereVeiculo(carro);

        //chassi, numeroEixos, marca, modelo
        caminhao = new Caminhao("9BRW67YT4", 6, "VW", "13130");
        g.insereVeiculo(caminhao);

        //chassi, numeroEixos, marca, modelo
        caminhao = new Caminhao("9BRWU5O98D", 8, "Mercedes", "1620");
        g.insereVeiculo(caminhao);

        //chassi, numeroEixos, marca, modelo
        caminhao = new Caminhao("9BRWY4EW21P", 5, "Iveco", "Daily");
        g.insereVeiculo(caminhao);

        g.gerarRelatorio();

        g.removerVeiculo("KLM-0123");

        g.removerVeiculo("9BRWY4EW21P");

        g.gerarRelatorio();
    }
}
