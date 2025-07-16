package Exercicio_2;


public class Vendedor extends Pessoa {
    
    private int qtdeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.qtdeVendas = 0;
    }
    
    public void realizarVenda()
    {
        this.setQtdeVendas(this.getQtdeVendas() + 1);
        System.out.println("Venda realizada!");
    }

    public int getQtdeVendas() {
        return qtdeVendas;
    }

    public void setQtdeVendas(int qtdeVendas) {
        this.qtdeVendas = qtdeVendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "qtdeVendas=" + qtdeVendas + '}';
    }
}
