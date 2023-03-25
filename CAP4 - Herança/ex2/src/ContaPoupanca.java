public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca(String cliente, int numCont, double saldo, int diaRendimento) {
        super(cliente, numCont, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo() {
        this.saldo *=  1 + diaRendimento/100.0;
        System.out.println(saldo);
    }

    public void mostra() {
        super.mostra();
        System.out.println(diaRendimento);
    }
}
