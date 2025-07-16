package Exercicio_3;


public non-sealed class RelogioBR extends Relogio {

    @Override
    public Relogio convert(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch(relogio)
        {
            case RelogioEUA relogioEUA ->
            {
                this.hora = (relogioEUA.getPeriodo().equals("PM")) ?
                relogioEUA.getHora() + 12 :
                relogioEUA.getHora();
            }
            case RelogioBR relogioBR -> this.hora = relogioBR.getHora();
        }
        return this;
    }
}
