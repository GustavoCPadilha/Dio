package Exercicio_2;

import java.util.Scanner;

public class Carro {
    
    Scanner scanner = new Scanner(System.in);
    
    private boolean ligado;
    private int velocidade;
    private char direcao; //n para neutro, d para direita e e para esquerda
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.direcao = 'n';
        this.marcha = 0;
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
        if (this.isLigado() && this.getMarcha() == 0 && this.getVelocidade() == 0)
        {
            this.setLigado(false);
            System.out.println("Carro desligado!");
        }
        else if (!this.isLigado())
        {
            System.out.println("Carro já está desligado!");
        }
        else
        {
            System.out.println("Para desligar, coloque a marcha em ponto morto!");
        }
    }
    
   public void acelerar()
{
    if (!this.isLigado()) 
    {
        System.out.println("O carro está desligado. Ligue o carro primeiro!");
        return;
    }
    if (this.getMarcha() != 0)
    {
        System.out.printf("Quanto deseja acelerar? (velocidade atual: %d Km/h)\n", this.getVelocidade());
        int acelera = scanner.nextInt();
        int velocidade_maxima = 0;
        switch (this.getMarcha()) 
        {
            case 0 -> System.out.println("Você não pode acelerar com a marcha no neutro!");
            case 1 -> velocidade_maxima = 20;
            case 2 -> velocidade_maxima = 40;
            case 3 -> velocidade_maxima = 60;
            case 4 -> velocidade_maxima = 80;
            case 5 -> velocidade_maxima = 100;
            case 6 -> velocidade_maxima = 120;
        }

        if (this.getDirecao() != 'n' && this.getVelocidade() + acelera > 40)
        {
            System.out.println("Não é possível acelerar além de 40km/h com o volante virado! Desvire o volante primeiro.");
            return;
        }

        if (this.getVelocidade() + acelera <= velocidade_maxima)
        {
            System.out.printf("Acelerou! +%dKm/h\n", acelera);
            this.setVelocidade(this.getVelocidade() + acelera);
            System.out.printf("Velocidade atual: %d km/h\n", this.getVelocidade());
        }
        else
        {
            System.out.printf("Acelerou! +%dKm/h\n", velocidade_maxima - this.getVelocidade());
            System.out.println("Para acelerar mais, aumente a marcha!");
            this.setVelocidade(velocidade_maxima);
            System.out.printf("Velocidade atual: %d km/h\n", this.getVelocidade());
        }
    }
    else
    {
        System.out.println("Você não pode acelerar na marcha neutra!");
    }
}
    
    public void freiar()
    {
        if (!this.isLigado()) 
        {
            System.out.println("O carro está desligado. Ligue o carro primeiro!");
            return;
        }
        if (this.getMarcha() != 0)
        {
            System.out.printf("Quanto deseja freiar? (velocidade atual: %d Km/h)\n", this.getVelocidade());
            int freia = scanner.nextInt();
            int velocidade_minima = 0;
            switch (this.getMarcha()) 
            {
                case 0 -> System.out.println("Você não pode diminuir a velocidade já estando com a marcha no neutro!");
                case 1 -> velocidade_minima = 0;
                case 2 -> velocidade_minima = 21;
                case 3 -> velocidade_minima = 41;
                case 4 -> velocidade_minima = 61;
                case 5 -> velocidade_minima = 81;
                case 6 -> velocidade_minima = 101;
            }
            if (this.getVelocidade() - freia >= velocidade_minima)
            {
                System.out.printf("Freiou! %dKm/h\n", freia);
                this.setVelocidade(this.getVelocidade() - freia);
                System.out.printf("Velocidade atual: %d km/h\n", this.getVelocidade());
            }
            else
            {
                System.out.printf("Freiou! %dKm/h\n", velocidade_minima - this.getVelocidade());
                System.out.println("Para freiar mais, diminua a marcha!");
                this.setVelocidade(velocidade_minima);
                System.out.printf("Velocidade atual: %d km/h\n", this.getVelocidade());
            }
        }
        else
        {
            System.out.println("Você não pode diminuir a velocidade na marcha neutra!");
        }
    }
    
    public void virar()
    {
        if (!this.isLigado()) 
        {
            System.out.println("O carro está desligado. Ligue o carro primeiro!");
            return;
        }
        if (this.getVelocidade() >= 1 && this.getVelocidade() <= 40)
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
                        System.out.println("Virando para esquerda!");
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
                        System.out.println("Virando para direita!");
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
        else
        {
            System.out.println("O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km!");
        }
    }
    
    public void status()
    {
        System.out.println("----- STATUS DO CARRO -----");
        System.out.printf("Está ligado? %b\n", this.isLigado());
        System.out.printf("Velocidade: %d\n", this.getVelocidade());
        System.out.printf("Direção: %c\n", this.getDirecao());
        System.out.printf("Marcha: %d\n", this.getMarcha());
        System.out.println("---------------------------");
    }
    
    public void aumentaMarcha()
    {
        if (!this.isLigado()) 
        {
            System.out.println("O carro está desligado. Ligue o carro primeiro!");
            return;
        }
        if (this.getVelocidade() == 0 || this.getVelocidade() == 20 ||
            this.getVelocidade() == 40 || this.getVelocidade() == 60 ||
            this.getVelocidade() == 80 || this.getVelocidade() == 100 ||
            this.getVelocidade() == 120)
        {
            if (this.getMarcha() < 6)
            {
                this.setMarcha(this.getMarcha() + 1);
                System.out.printf("Aumentou marcha! (Marcha atual: %d)\n", this.getMarcha());       
            }
            else
            {
                System.out.println("Você já está na marcha máxima!");
            }
        }
        else
        {
            System.out.println("Velocidade inadequada para troca de marcha!");
        }
    }
    
    public void diminuiMarcha()
    {
        if (!this.isLigado()) 
        {
            System.out.println("O carro está desligado. Ligue o carro primeiro!");
            return;
        }
        if (this.getVelocidade() == 0 || this.getVelocidade() == 21 ||
            this.getVelocidade() == 41 || this.getVelocidade() == 61 ||
            this.getVelocidade() == 81 || this.getVelocidade() == 101)
        {
            if (this.getMarcha() > 0)
            {
                this.setMarcha(this.getMarcha() - 1);
                System.out.printf("Diminuiu marcha! (Marcha atual: %d)\n", this.getMarcha());    
            }
            else
            {
                System.out.println("Você já está na marcha mínima!");
            }
        }
        else
        {
            System.out.println("Velocidade inadequada para troca de marcha!");
        }
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

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}
