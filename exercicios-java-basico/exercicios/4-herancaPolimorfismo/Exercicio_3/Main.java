package Exercicio_3;


public class Main {
    
    public static void main(String[] args)
    {
        Relogio relogioBR = new RelogioBR();
        relogioBR.setSegundo(0);
        relogioBR.setMinuto(0);
        relogioBR.setHora(25); 
        
        System.out.println(relogioBR.getTime());
        
        System.out.println(new RelogioEUA().convert(relogioBR).getTime());
    }
}
