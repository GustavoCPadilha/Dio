package Exercicio_2;

public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Gerente gerente = new Gerente("Ana", "ana@empresa.com", "senha123");
        Vendedor vendedor = new Vendedor("Carlos", "carlos@empresa.com", "senha456");
        Atendente atendente = new Atendente(500.0f, "Juliana", "juliana@empresa.com", "senha789");

        // Testando métodos do Gerente
        System.out.println("\n--- Gerente ---");
        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.alterarDados();
        gerente.alterarSenha();
        gerente.realizarLogff();

        // Testando métodos do Vendedor
        System.out.println("\n--- Vendedor ---");
        vendedor.realizarLogin();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.alterarDados();
        vendedor.alterarSenha();
        vendedor.realizarLogff();

        // Testando métodos do Atendente
        System.out.println("\n--- Atendente ---");
        atendente.realizarLogin();
        atendente.receberPagamentos(200.50f);
        atendente.receberPagamentos(100.00f);
        System.out.println("Valor atual em caixa: R$" + atendente.getValorCaixa());
        atendente.fecharCaixa();
        System.out.println("Valor após fechar caixa: R$" + atendente.getValorCaixa());
        atendente.realizarLogff();
    }
}
