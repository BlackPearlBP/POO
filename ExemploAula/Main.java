package ExemploAula;

public class Main {
    public static void main(String[] args) {
        
        Gato sabugo = new Gato("Munchkin", "Sabugo", 1, "Cinza");
        
        System.out.printf("Oi meu nome é %s!", sabugo.getNome());
        sabugo.brincar();

        Tutor brunno = new Tutor("Brunno", sabugo);

        Casa brunnoHouse = new Casa("Rua Senador");

        brunnoHouse.adotarGato(sabugo);

        brunnoHouse.chamarMoradores();
    }
}
