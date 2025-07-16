package Exercicio_3;


public non-sealed class RelogioEUA extends Relogio {

    private String periodo;
    
    @Override
    public void setHora(int hora) {
        this.setAM();
        if (hora > 12 && hora <= 23)
        {
            this.setPM();
            this.hora = hora - 12;
        }
        else if (hora >= 24)
        {
            this.hora = 0;
        }
        else
        {
            this.hora = hora;
        }
    }
            
    @Override
    Relogio convert(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
                switch(relogio)
        {
            case RelogioEUA relogioEUA -> 
            {
                this.hora = relogioEUA.getHora();
                this.periodo = relogioEUA.getPeriodo();
            }
            case RelogioBR relogioBR ->
                this.setHora(relogioBR.getHora());
        }
        return this;
    }
    
    @Override
    public String getTime()
    {
        return super.getTime() + " " + this.periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPM() 
    {
        this.periodo = "PM";
    }
    
    public void setAM()
    {
        this.periodo = "AM";
    }
}
