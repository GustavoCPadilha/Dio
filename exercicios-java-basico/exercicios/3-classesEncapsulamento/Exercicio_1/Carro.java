package gustavo.classesencapsulamento.Exercicio_1;

import java.util.Scanner;

public class Carro {
    
    Scanner scanner = new Scanner(System.in);
    
    private boolean ligado;
    private int velocidade;
    private char direcao; //n para neutro, d para direita e e para esquerda
    private char marcha;

    public Carro(String direcao) {
        this.ligado = false;
        this.velocidade = 0;
        this.direcao = 'n';
        this.marcha = 'n';
    }

    public void ligar()
    {
        if (!this.isLigado())
        {
            this.setLigado(true);
            System.out.println("Carro ligado!");
        }
        else
        {
            System.out.println("Carro já está ligado!");
        }
    }
    
    public void desligar()
    {
        if (this.isLigado())
        {
            this.setLigado(false);
            System.out.println("Carro desligado!");
        }
        else
        {
            System.out.println("Carro já está desligado!");
        }
    }
    
    public void linha()
    {
        System.out.println("-=-=-=-=-=-=-=-");
    }
    
    public void acelerar()
    {
        this.setVelocidade(this.getVelocidade() + 10);
        System.out.println("Acelerou! +10Km/h");
    }
    
    public void freiar()
    {
        this.setVelocidade(this.getVelocidade() - 10);
        System.out.println("Freiou! -10Km/h");
    }
    
    public void virar()
    {
        System.out.println("""
                           1 - Esquerda
                           2 - Direita
                           3 - Neutro (reto)
                           4 - Cancelar
                           Para que lado deseja virar?""");
        int opcao = scanner.nextInt();
        switch (opcao)
        {
            case 1 -> {
                if (this.getDirecao() == 'e')
                {
                    System.out.println("O volante já está virado para esquerda!");
                }
                else
                {
                    System.out.println("Virando para Esquerda!");
                    this.setDirecao('e');      
                }
            }
            case 2 -> {
                if (this.getDirecao() == 'd')
                {
                    System.out.println("O volante já está virado para direita!");
                }
                else
                {
                    System.out.println("Virando para Direita!");
                    this.setDirecao('d');      
                }
            }
            case 3 -> {
                if (this.getDirecao() == 'n')
                {
                    System.out.println("O volante já está neutro!");
                }
                else
                {
                    System.out.println("Deixando o volante neutro!");
                    this.setDirecao('n');            
                }
            }
            case 4 -> System.out.println("Cancelando operação!");
            default -> System.out.println("Operação inválida. Tente novamente!");
        }
    }
    
    public void status()
    {
        linha();
        System.out.printf("Está ligado? %b\n", this.isLigado());
        System.out.printf("Velocidade: %d\n", this.getVelocidade());
        System.out.printf("Direção: %c\n", this.getDirecao());
        System.out.printf("Marcha: %c\n", this.getMarcha());
        linha();
    }
    
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public char getMarcha() {
        return marcha;
    }

    public void setMarcha(char marcha) {
        this.marcha = marcha;
    }
    
    
    
}
