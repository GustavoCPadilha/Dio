package Exercicio_1;


public class IngressoFamilia extends Ingresso {
    private int qtdePessoas;
    
    public IngressoFamilia(float valor, String nome, boolean dublado, int qtdePessoas) {
        super(valor, nome, dublado);
        this.qtdePessoas = qtdePessoas;
        this.valor = valor * qtdePessoas;
        if (qtdePessoas > 3)
        {
            this.valor = (float) (this.valor - (this.valor * 0.05));
        }
    }
    
    @Override
    public void informaValor()
    {
        System.out.printf("Você escolheu o ingresso família para %d pessoas!\n", this.getQtdePessoas());
        System.out.printf("Valor: %.2fR$\n", this.getValor());
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }
}
