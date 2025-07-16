package Exercicio_2;


public class Atendente extends Pessoa {
    
    private float valorCaixa;

    public Atendente(float valorCaixa, String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorCaixa = valorCaixa;
    }
    
    public void receberPagamentos(float valor)
    {
        this.setValorCaixa(this.getValorCaixa() + valor);
        System.out.printf("Recebido %.2fR$\n", valor);
    }
    
    public void fecharCaixa()
    {
        this.setValorCaixa(0);
        System.out.println("Fechando caixa!");
    }

    public float getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(float valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    @Override
    public String toString() {
        return "Atendente{" + "valorCaixa=" + valorCaixa + '}';
    }
}
