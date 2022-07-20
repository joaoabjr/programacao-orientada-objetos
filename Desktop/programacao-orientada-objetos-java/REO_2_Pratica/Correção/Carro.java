/* Práticas e conceitos básicos - parte 2 (Práticas de Programação Orientada a Objetos),
 * feito por: João Almeida Barbosa Júnior - 201820285,
 * Classe Carro;
 * Os comentários dos métodos são do documento em PDF, para facilitar o entendimento da função do mesmo.
 * 23/08/2021
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Carro {
    String modelo; //armazena o modelo do carro //Erro: modificadores de visibilidade?
    ArrayList<Integer> acessorios; //cria um Arraylist de acessórios do tipo Inteiro  //Erro: modificadores de visibilidade?

    //construtor Carro
    public Carro(String modelo) {
        this.modelo = modelo;
        acessorios = new ArrayList();//Erro: new ArrayList(). O correto é: new ArrayList<Integer>() 
    }

    //retorna o modelo do carro
    public String retornaModelo() {
        return modelo;
    }

    //retorna a quantidade de acessórios comprados para o carro
    public int retornaQtdAcessorios() {
        return acessorios.size(); 
    }

    //retorna o código de um acessório armazenado em uma posição específica do arraylist
    public int retornaCodigo(int posicao) {
        //result vai armazenar o código da posição X do arraylist
        int result;//Obs: criação desnecessária de variável
        result = acessorios.get(posicao);
        return result;
    }

    //insere no arraylist o código de um acessório escolhido
    public void inserirCodigo(int codigo) {
        acessorios.add(codigo);
    }

    //!ATENÇÃO: ESSE MÉTODO NÃO DEVE IMPRIMIR NADA NA TELA.
}
