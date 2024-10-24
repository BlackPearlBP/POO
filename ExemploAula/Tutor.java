package ExemploAula;
import java.util.List;
import java.util.ArrayList;

public class Tutor {
    private String nome;
    private List<ArrayList> gatos;

    public Tutor(String nome,Gato gato){
        this.nome = nome;
        this.gatos.add(gato);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ArrayList> getGatos() {
        return this.gatos;
    }

    public void setGatos(List<ArrayList> gatos) {
        this.gatos = gatos;
    }

    public void chamarGatos(){
        for (Gato gato : this.gatos){
            System.out.println(" %s \n",gato.getNome());
        }
    }
}
