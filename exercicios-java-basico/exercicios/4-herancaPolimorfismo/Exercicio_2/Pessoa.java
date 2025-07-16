package Exercicio_2;

import java.util.Scanner;


public abstract class Pessoa {
    
    protected String nome, email, senha;
    protected boolean administrador;
    
    Scanner scanner = new Scanner(System.in);

    public Pessoa(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }
    
    public void consultarVendas()
    {
        System.out.println("Consultando vendas de todos os vendedores...");
    }
    
    public void realizarLogin()
    {
        System.out.println("Realizando login!");
    }
    
    public void realizarLogff()
    {
        System.out.println("Realizando logff!");
    }
    
    public void alterarDados()
    {
        System.out.println("Digite um novo nome:");
        String novoNome = scanner.nextLine();
        this.setNome(novoNome);
        
        System.out.println("Digite um novo e-mail:");
        String novoEmail = scanner.nextLine();
        this.setEmail(novoEmail);
        
        System.out.println("Dados alterados com sucesso!");
    }
    
    public void alterarSenha()
    {
        System.out.println("Digite uma nova senha:");
        String novaSenha = scanner.nextLine();
        this.setSenha(novaSenha);
        
        System.out.println("Dados alterados com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", senha=" + senha + ", administrador=" + administrador + '}';
    }
}
