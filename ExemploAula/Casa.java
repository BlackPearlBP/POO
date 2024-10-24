package ExemploAula;
import java.util.List;

public class Casa {
    private String endereco;
    private List<Gato> gatos;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Gato> getGatos() {
        return gatos;
    }

    public void setGatos(List<Gato> gatos) {
        this.gatos = gatos;
    }

    public Casa(String endereco){
        this.endereco = endereco;
    }

    public void chamarMoradores(){
        for (Gato gato : gatos) {
            System.out.printf("Gato: %s", gato);
        }
    }

    public void adotarGato(Gato gato){
        this.gatos.add(gato);
    }
}
