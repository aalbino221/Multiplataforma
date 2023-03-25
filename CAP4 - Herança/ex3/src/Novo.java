public class Novo extends Imovel {
    private double adicional;

    public Novo(int codigo, String endereco, double preco, double adicional) {
        super(codigo, endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void mostra(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: " + (preco + adicional) + " mil");
    }

}
