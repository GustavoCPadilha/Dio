package Exercicio_1;


public class Main {
    public static void main(String[] args) {
        Ingresso convencional = new Ingresso(30.0f, "Filme X", true);
        Ingresso meia = new IngressoMeia(30.0f, "Filme X", false);
        Ingresso familia = new IngressoFamilia(30.0f, "Filme X", true, 4);

        convencional.informaValor();  // mostra 30.00
        meia.informaValor();         // mostra 15.00
        familia.informaValor();      // mostra 114.00 (30 * 4 = 120 - 5%)
    }
}
