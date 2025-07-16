package Exercicio_2;


public class Gerente extends Pessoa{

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }
    
    public void gerarRelatorioFinanceiro()
    {
        System.out.println("Gerando relatório financeiro");
    }
    

    @Override
    public String toString() {
        return "Gerente{" + '}';
    }
}
