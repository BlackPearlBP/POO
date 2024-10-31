package Abstrato;

public class LojaShopping extends Loja implements Registro {
    private String endereco;
    private String gerente;

    public LojaShopping(String identificador, String cnpj, String razaoSocial, String endereco,  String gerente) {
        super(identificador, cnpj, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    @Override
    public void mostrarDados(){
        System.out.println("Identificador: "+identificador);
        System.out.println("Razão Social: "+getRazaoSocial());
        System.out.println("CNPJ: "+getCnpj());
        System.out.println("Status: "+getStatus());
        System.out.println("Endereço: "+endereco);
        System.out.println("Gerente: "+gerente);
    }

    @Override
    public void registraAberturaDia(){
        if (!getStatus().equals("Aberta")) {
            aberta = true;
            System.out.println("A loja foi aberta!");
        } else {
            System.out.println("A loja já está aberta!");
        }
    }

    @Override
    public void registraFechamentoDia(){
        if (getStatus().equals("Fechada")) {
            aberta = false;
            System.out.println("A loja foi fechada!");
        } else {
            System.out.println("A loja já está fechada!");
        }
    }

}
