/* Práticas e conceitos básicos - parte 2 (Práticas de Programação Orientada a Objetos),
 * feito por: João Almeida Barbosa Júnior - 201820285,
 * Classe TesteCarro;
 * 23/08/2021
 */

import java.util.Scanner;
import java.util.ArrayList;

public class TesteCarro {
    public static void main(String[] args) {
        //preçoAcessorio armazena o preço de cada acessório, com os valores respectivos de cada código de acessório:
        //Banco de couro = 1500.00, som = 850.00 e insufilm = 200.00
        int quantidade, codigo, precoAcessorio[] = {1500, 850, 200}, precoTotal = 0;
        String modelo;
        Scanner entrada = new Scanner(System.in); //inicializa o Scanner para entrada de conteúdo

        //entra com o modelo do carro na variável modelo
        System.out.printf("Digite o modelo do carro (Up/Voyage/Virtus): ");
        modelo = entrada.nextLine();

        //construtor da classe Carro, passando o modelo como parâmetro
        Carro carro = new Carro(modelo);

        //entra com a quantidade de acessórios
        System.out.printf("Entre com a quantidade de acessórios desejados: ");
        quantidade = entrada.nextInt();

        //inserindo o código no Arraylist acessorios
        for(int i=1; i<=quantidade; i++){
            System.out.printf("Insira o código do " + i + "º acessório desejado (0: banco de couro, 1: som, 2: insulfilm): ");
            codigo = entrada.nextInt();

            //verifica a condição se o código é 0, 1 ou 2 (somente os códigos possíveis). caso o código não seja válido, devolve um print 
            if(codigo < 0 || codigo > 2){
                System.out.printf("\nERRO: Código desconhecido.\n");
                System.exit(-1);
            }
            
            //se o código for válido, é inserido no Arraylist acessorios
            else
                carro.inserirCodigo(codigo);
        }
        
        //calculando o preço final dos acessórios
        int n = carro.retornaQtdAcessorios();

        for(int j=1; j<=n; j++){
            //precoAcessorio[] = {1500, 850, 200}
            //precoTotal vai armazenar o valor do acessório escolhido (com base no método retornaCódigo, que vai pegar o código e associar com a posição do vetor precoAcessorio)
            precoTotal = precoTotal + precoAcessorio[carro.retornaCodigo(j-1)]; //j-1 devido ao for começar em 1 (e não pegar posição a mais)
        }

        //printando o relatório 
        System.out.printf("\n############### NOTA FISCAL ###############");
        System.out.printf("\nCarro: " + carro.retornaModelo());
        System.out.printf("\nPreço dos acessórios = " + precoTotal);//Obs: Para que printf???

        //fechando o input do Scanner 
        entrada.close();
    }
}
