public class Aluno  extends Pessoa{
    private int ra;

    public Aluno(String nome, int cpf, int ra) {
        super(nome, cpf);
        this.ra = ra;
    }


    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
