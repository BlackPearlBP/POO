package Abstrato;

public abstract class Loja {
    protected String identificador;
    private final String cnpj;
    private final String razaoSocial;
    protected boolean aberta;

    public Loja(String identificador, String cnpj, String razaoSocial){
        this.identificador = identificador;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false; //Começar fechada
    }

    public String getRazaoSocial(){
        return razaoSocial;
    }

    public String getCnpj(){
        return cnpj;
    }

    public String getStatus(){
        return  aberta ? "Aberta" : "Fechada";

    }

    public abstract void mostrarDados();
}