public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalha,boolean atendeEmCasa) {
        super(trabalha);
        this.atendeEmCasa = atendeEmCasa;
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar(){
        System.out.println("Receita emitida");
    }
}
