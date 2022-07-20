public class Terceirizado extends MembroUniversidade {
    private String empresa;

    public Terceirizado(String id, double salario, String empresa) {
        super(id, salario);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }
}
