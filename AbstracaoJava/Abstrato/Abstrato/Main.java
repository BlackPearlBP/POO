package Abstrato;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LojaShopping> lojas = new ArrayList<>();

        LojaShopping loja1 = new LojaShopping("001", "12345678912345", "Loja dos Crias", "Rua Braba", "Eliel Schubert");
        LojaShopping loja2 = new LojaShopping("002", "12345678912346", "Loja Brabíssima","Rua dos Nervosos", "Gabriel Soares");
        LojaShopping loja3 = new LojaShopping("003", "12345678912347","Loja Traquina","Rua dos Comédia","Bervanda Fernald");

        lojas.add(loja1);
        lojas.add(loja2);
        lojas.add(loja3);

        for (LojaShopping loja : lojas){
            loja.registraAberturaDia();
            loja.mostrarDados();
            System.out.println("\n");
        }
    }
}
