public class Main {
    public static void main(String[] args) {
        Imovel casa1 = new Imovel(1,"Av. Brasil 60", 200 );
        Novo casa2 = new Novo(2,"Av. Brasil 158", 200, 50);
        Usado casa3 = new Usado(3,"Av. Brasil 198",200, 50);

        casa1.mostra();
        casa2.mostra();
        casa3.mostra();
    }
}