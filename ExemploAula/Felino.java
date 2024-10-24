package ExemploAula;

abstract class Felino implements Animal {
    String nome;
    int idade;
    String cor;

    public Felino(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public void comer(){
        System.out.println("Comendo!\n");
    }

    @Override
    public void dormir(){
        System.out.println("Dormindo!\n");
    }

    public abstract void fazerSom();

    public abstract void brincar();

    public void correr(){
        System.out.println("Correndo!\n");
    }

    public String getNome() {
        return this.nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            this.idade = 0;
        } else {
            this.idade = idade;
        }
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
