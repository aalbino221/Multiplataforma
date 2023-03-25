public class Main {
    public static void main(String[] args) {
        Gerente g1 =  new Gerente("Jorge",5000,"jorginho123","1122");
        Telefonista t1 = new Telefonista("Isadora",1500,5489);
        Secretaria s1 = new Secretaria("Gabriela",2000,1234567);
        System.out.println("Bonificação gerente - " + g1.calculaBonificao());
        System.out.println("Bonificação telefonista - " + t1.calculaBonificao());
        System.out.println("Bonificação Secretaria - " + s1.calculaBonificao());
        g1.mostraDados();
        t1.mostraDados();
        s1.mostraDados();
    }
}