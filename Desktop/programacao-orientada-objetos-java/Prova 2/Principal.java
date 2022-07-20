public class Principal{
    public static void main(String[] args){
        String s = null; 
        
        try{
            //tentando pegar a primeira letra da palavra s
            s.charAt(0);
        }
        catch(NullPointerException e){
            //irá imprimir erro de null pointer exception, já que s tem valor nulo
            System.out.println("Erro: " + e.getMessage()); 
        }
    }
}