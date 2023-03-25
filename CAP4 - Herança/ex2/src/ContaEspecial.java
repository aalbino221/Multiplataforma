public class ContaEspecial extends ContaBancaria {
    private float limit;

    public ContaEspecial(String cliente, int numCont, double saldo, float limit) {
        super(cliente, numCont, saldo);
        this.limit = limit;
    }

    public void sacar(double saque){
        this.saldo -= saque;
        System.out.println("Sacados: " + saque);
    }

    public void mostra() {
        super.mostra();
        System.out.println(limit);
    }

}
