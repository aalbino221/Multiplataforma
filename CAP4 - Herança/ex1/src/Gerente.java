public class Gerente extends Funcionario{
    private String nomeUsuario, senha;

    public Gerente(String nome, double salario, String nomeUsuario, String senha) {
        super(nome, salario);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public void mostraDados(){
        super.mostraDados();
        System.out.println(nomeUsuario);
        System.out.println(senha);
    }
    public double calculaBonificao() {
        return this.getSalario()*1.25;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
