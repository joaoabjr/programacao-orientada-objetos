import java.util.Scanner;

public class Votacao {
    private static Scanner entrada;
    private static HistogramaVotos hv;
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        int opcao;
        do{
            exibirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            processarOpcao(opcao);
           
        }while(opcao != 6);
    }
    
    private static void exibirMenu(){
        System.out.println("=======MENU=======");
        System.out.println("1 - Carregar dados de arquivo texto"); //lê
        System.out.println("2 - Carregar dados de arquivo binario"); //lê
        System.out.println("3 - Gerar relatorio na tela"); //imprime
        System.out.println("4 - Salvar relatorio em arquivo de texto"); //escreve
        System.out.println("5 - Salvar relatorio em arquivo binario"); //esccreve
        System.out.println("6 - Sair\n");
        System.out.print("Digite sua opcao: ");
    }

    private static void processarOpcao(int opcao){
        switch(opcao){
        case 1:
            carregarArquivoTexto();
            break;
        case 2:
            carregarArquivoBinario();
            break;
        case 3:
            gerarRelatorioTela();
            break;
        case 4:
            gerarArquivoTexto();
            break;
        case 5:
            gerarArquivoBinario();
            break;
        case 6://sair
            break;
        default: 
            System.out.println("Opção inválida!");
        }
    }

    private static void carregarArquivoTexto(){
        hv = null;//Eliminando carregamento de arquivo anterior
        hv = ManipuladoraArquivos.lerArquivoTexto(lerNomeArquivoTexto());
    }

    private static void gerarArquivoTexto() {
        try{
            if(hv != null){
                ManipuladoraArquivos.gerarArquivoTexto(hv.getHistograma(), lerNomeArquivoTexto());
            }else{
                System.out.println("Carregar dados de arquivo primeiro");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }    

    private static void carregarArquivoBinario(){
        hv = null;//Eliminando carregamento de arquivo anterior
        hv = ManipuladoraArquivos.lerArquivoBinario(lerNomeArquivoBinario());
    }

    private static void gerarArquivoBinario(){
        if(hv != null){
            ManipuladoraArquivos.gerarArquivoBinario(hv,lerNomeArquivoBinario());
        }else{
            System.out.println("Carregar dados de arquivo primeiro");
        }    
    }

    private static void gerarRelatorioTela(){
        if(hv != null){
            hv.gerarRelatorioTela();
        }else{
            System.out.println("Carregar dados de arquivo primeiro");
        }   
    }

    private static String lerNomeArquivoTexto(){
        System.out.print("Nome do arquivo texto: ");
        return entrada.nextLine();
    }

    private static String lerNomeArquivoBinario(){
        System.out.print("Nome do arquivo binario: ");
        return entrada.nextLine();
    }
}
