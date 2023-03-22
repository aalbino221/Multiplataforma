public class Secretaria extends Funcionario{
    private int numeroRamal;

    public Secretaria(String nome, double salario, int numeroRamal) {
        super(nome, salario);
        this.numeroRamal = numeroRamal;
    }

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }
}
