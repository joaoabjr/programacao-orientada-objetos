/*
 * Método para leitura de arquivo texto, uma para geração de arquivo texto, um para leitura de arquivo binário e um para geração de arquivo binário.
 */

/* 
 * Para a elaboração dessa classe, eu utilizei como base a aula de Arquivos e Serialização - Partes 1 e 2.
 * Utilizei de exemplo alguns métodos presentes na video-aula que me ajudaram a fazer o código.
 * Feito por: João Almeida Barbosa Júnior
 */

import java.io.*;
import java.util.*;

//fiz uso do tratamento de exceções com try e catch em todos os casos, devolvendo o tipo de erro e em qual arquivo o erro está presente
public class ManipuladoraArquivos implements Serializable{
    
    public static HistogramaVotos lerArquivoTexto(String nomeArquivo){
        HistogramaVotos h = new HistogramaVotos();

        try{
            BufferedReader arquivo = new BufferedReader(new FileReader(nomeArquivo)); //usando o empacotamento citado na aula 

            String linha = arquivo.readLine(); //retorna uma linha do arquivo de texto

            //enquanto houver linhas a serem lidas no arquivo...
            while(linha != null){ 
                String[] campos = linha.split(" "); //usado para dividir em substrings, pulando a linha ao achar um espaço

                //cadastrando os votos recebidos na variável "campos" (que recebeu os votos de cada linha do arquivo)
                for(int i = 0; i < campos.length; i++){
                    h.cadastrarVoto(campos[i]);
                }

                linha = arquivo.readLine();//recebendo null ao acabar
            }
            arquivo.close(); //fechando o arquivo ao finalizar a leitura
        }
        catch(FileNotFoundException erro){
            System.out.println("Erro ao encontrar o arquivo: " + nomeArquivo + ".");
        }
        catch(IOException erro){
            System.out.println("Erro no salvamento do arquivo: " + nomeArquivo + "." + " Erro detectado: " + erro.getMessage());
        }

        return h;
    }
    
    //função para gerar um arquivo de texto com os votos dos participantes e as frequências dos votos (usando o método gerarRelatorioTela())
    public static void gerarArquivoTexto(Map<String, Integer> histo, String nomeArquivo){ 
        try{
            FileWriter arquivo = new FileWriter(nomeArquivo);
            
            //for para gravação de todas as linhas no arquivo, pegando o valor e a chave do nosso map de votos
            //entrySet nos retorna uma "visão geral" de todo o nosso map a ser percorrido
            for(Map.Entry<String, Integer> histograma : histo.entrySet()){
                arquivo.write(String.format("%-10s %3d%n", histograma.getKey(), histograma.getValue()));
            }
            
            arquivo.close();
        }
        catch(IOException erro){
            System.out.println("Erro no salvamento do arquivo: " + nomeArquivo + "." + " Erro detectado: " + erro.getMessage());
        }
    }

    //função para ler um arquivo binário já com algum conteúdo presente 
    public static HistogramaVotos lerArquivoBinario(String nomeArquivo){ 
        HistogramaVotos h = new HistogramaVotos();

        try{
            ObjectInputStream objetoIS = new ObjectInputStream(new FileInputStream(nomeArquivo));
            h = (HistogramaVotos)objetoIS.readObject();
            h.gerarRelatorioTela();
            objetoIS.close();
        } 
        catch (Exception erro) {
            System.out.println("Erro no arquivo: " + erro.getMessage());
        }

        return h;
    }

    //função para escrever (gerar) um arquivo binário
    public static void gerarArquivoBinario(HistogramaVotos histo, String nomeArquivo){ 
        try{ 
            ObjectOutputStream objetoOS = new ObjectOutputStream(new FileOutputStream(nomeArquivo));

            //a serialização permite passar o objeto direto (que foi cadastrado na classe Histograma ao gerar o arquivo de texto)
            //OBRIGADO POR ME SALVAR NA AULA!!!
            objetoOS.writeObject(histo);
           
            objetoOS.close();
        } 
        catch (IOException erro){
            System.out.println("Erro no salvamento do arquivo: " + erro.getMessage());
            
        }//fiz um catch a mais pra localizar um erro que estava acontecendo
        catch(Exception erro){
            System.out.println("Erro no arquivo: " + erro.getMessage());
        }
    }
}
