package Models;

public class Comissario extends Pessoa {

    protected String nome;
    protected long cpf;
    protected String telefone;
    protected int idCarteiraComissario;
    protected String funcaoVoo;

    public Comissario() {

    }

    public Comissario(long cpf, String nome, String telefone, int idCarteiraComissario, String funcaoVoo) {

        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.idCarteiraComissario = idCarteiraComissario;
        this.funcaoVoo = funcaoVoo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdCarteiraComissario() {
        return idCarteiraComissario;
    }

    public void setIdCarteiraComissario(int idCarteiraComissario) {
        this.idCarteiraComissario = idCarteiraComissario;
    }

    public String getFuncaoVoo() {
        return funcaoVoo;
    }

    public void setFuncaoVoo(String funcaoVoo) {
        this.funcaoVoo = funcaoVoo;
    }

}
