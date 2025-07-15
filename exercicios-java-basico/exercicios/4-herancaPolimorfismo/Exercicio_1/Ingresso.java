package Exercicio_1;


public class Ingresso {
    
    protected float valor;
    protected String nome;
    protected boolean dublado;

    public Ingresso(float valor, String nome, boolean dublado) {
        this.valor = valor;
        this.nome = nome;
        this.dublado = dublado;
    }
    
    public void informaValor() {
        System.out.println("Você escolheu o ingresso convencional!");
        System.out.printf("Valor: %.2fR$\n", this.getValor());
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }
}
