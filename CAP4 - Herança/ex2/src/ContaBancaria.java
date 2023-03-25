public class ContaBancaria {
    private String cliente;
    private int numCont;
    protected double saldo;

    public ContaBancaria(String cliente, int numCont, double saldo) {
        this.cliente = cliente;
        this.numCont = numCont;
        this.saldo = saldo;
    }

    public void sacar(double saque){
        if ((saldo - saque) < 0) {
            System.out.println("Saldo negativo");
            return;
        }
        this.saldo -= saque;
        System.out.println("Sacados: " + saque);
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("Depositado: " + deposito);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumCont() {
        return numCont;
    }

    public void setNumCont(int numCont) {
        this.numCont = numCont;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostra(){
        System.out.println(this.cliente);
        System.out.println(this.numCont);
        System.out.println(this.saldo);
    }

}
