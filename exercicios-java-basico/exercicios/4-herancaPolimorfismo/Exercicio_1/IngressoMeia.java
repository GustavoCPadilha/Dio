package Exercicio_1;


public class IngressoMeia extends Ingresso {

    public IngressoMeia(float valor, String nome, boolean dublado) {
        super(valor / 2, nome, dublado);
    }
    @Override
    public void informaValor() 
    {
        System.out.println("Você escolheu o ingresso de meia entrada!");
        System.out.printf("Valor: %.2fR$\n", this.getValor());
    }
}
