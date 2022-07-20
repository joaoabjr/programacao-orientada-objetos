import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Veiculo>frota;

    public Gerenciador(){
        frota = new ArrayList<>();
    }

    public void insereVeiculo(Veiculo v){
        frota.add(v);
    }

    public Veiculo buscarVeiculo(String id){
        for(Veiculo v: frota){
            if(v.getCodigo().equals(id)) return v;
        }
        return null;
    }

    public void removerVeiculo(String id){
        Veiculo v = buscarVeiculo(id);
        if(v != null){
            frota.remove(v);
        }
    }

    public void gerarRelatorio(){
        System.out.println("####FROTA###");
        for(Veiculo v: frota){
            System.out.println(v);
        }
    }
}
