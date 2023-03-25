public class Secretaria extends Funcionario{
    private int numeroRamal;

    public Secretaria(String nome, double salario, int numeroRamal) {
        super(nome, salario);
        this.numeroRamal = numeroRamal;
    }

    public void mostraDados(){
        super.mostraDados();
        System.out.println(numeroRamal);
    }

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }
}
