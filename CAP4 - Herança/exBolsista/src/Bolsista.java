public class Bolsista extends Aluno{
    private double bolsa;

    public Bolsista(String nome, int cpf, int ra, double bolsa) {
        super(nome, cpf, ra);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
