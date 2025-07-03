package Exercicio_3;


public class MaquinaBanho {
    
    private int agua;
    private int shampoo;
    private boolean ocupada;
    private boolean limpa;

    public MaquinaBanho() {
        this.agua = 0;
        this.shampoo = 0;
        this.ocupada = false;
        this.limpa = true;
    }
    
    public void banho()
    {
        if (this.isOcupada())
        {
            System.out.println("Tomou banho!");
            this.setAgua(this.getAgua() - 10);
            this.setShampoo(this.getShampoo() - 2);         
        }
        else
        {
            System.out.println("Primeiro coloque o pet na máquina de banho!");
        }
    }
    
    public void abasteceAgua()
    {
        if (this.getAgua() < 30)
        {
            System.out.println("Abasteceu a água! +2L");
            this.setAgua(this.getAgua() + 2);      
        }
        else
        {
            System.out.println("A capacidade de água já está completa!");
        }
    }
    
    public void abasteceShampoo()
    {
        if (this.getShampoo() < 10)
        {
            System.out.println("Abasteceu o shampoo! +2L");
            this.setShampoo(this.getShampoo() + 2);
        }
        else
        {
            System.out.println("A capacidade de shampoo já está completa!");
        }
    }
    
    public void verificaAgua()
    {
        System.out.printf("Nível de água atual: %dL\n", this.getAgua());
    }
    
    public void verificaShampoo()
    {
        System.out.printf("Nível de shampoo atual: %dL\n", this.getShampoo());
    }
    
    public void verificaPetBanho()
    {
        if (this.isOcupada())
        {
            System.out.println("A máquina de banho está ocupada!");
        }
        else
        {
            System.out.println("A máquina de banho não está ocupada!");
        }
    }
    
    public void colocaPet()
    {
        if (!this.isOcupada())
        {
            System.out.println("Pet colocado na máquina");
            this.setOcupada(true);
        }
        else
        {
            System.out.println("A máquina já está ocupada!");
        }
    }
    
    public void retiraPet()
    {
        this.setOcupada(false);
        this.setLimpa(false);
    }
    
    public void limpaMaquina()
    {
        if (!this.isOcupada())
        {
            this.setLimpa(true);
        }
        else
        {
            System.out.println("Você precisa retirar o pet antes de limpar!");
        }
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean isLimpa() {
        return limpa;
    }

    public void setLimpa(boolean limpa) {
        this.limpa = limpa;
    }
}