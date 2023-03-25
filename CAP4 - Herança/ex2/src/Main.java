public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Jorjinho",01,1500);
        ContaPoupanca conta2 = new ContaPoupanca("Flavinho",02, 2000.0, 10);
        ContaEspecial conta3 = new ContaEspecial("Roberto",03,100,-1000);

        conta1.depositar(100);
        conta2.depositar(200);
        conta3.depositar(50);

        conta1.sacar(100);
        conta2.sacar(200);
        conta3.sacar(500);

        conta1.mostra();
        conta2.mostra();
        conta3.mostra();

        conta2.calcularNovoSaldo();

    }
}