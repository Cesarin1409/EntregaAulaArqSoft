package Models;

public class Piloto extends Pessoa {
    // brevê é o nome dado a certificaçao concedida pra pilotar tipo carteira de
    // piloto.
    protected int idbreve;
    // piloto pode ser piloto(conduz a aeronave) ou copiloto(conduz navegaçao)
    protected String funcaoVoo;

    public Piloto() {
    }

    public Piloto(long cpf, String nome, String telefone, int idbreve, String funcaoVoo) {
        super(cpf, nome, telefone);
        this.idbreve = idbreve;
        this.funcaoVoo = funcaoVoo;
    }

    public int getIdbreve() {
        return idbreve;
    }

    public void setIdbreve(int idbreve) {
        this.idbreve = idbreve;
    }

    public String getFuncaoVoo() {
        return funcaoVoo;
    }

    public void setFuncaoVoo(String funcaoVoo) {
        this.funcaoVoo = funcaoVoo;
    }

    @Override
    public String toString() {
        return "Piloto: " + nome + ",\n cpf: " + cpf + ", \n Telefone: " + telefone + ",\n numero do brevê: " + idbreve
                + ", \n Funçao no Voo=" + funcaoVoo + "\n";
    }

}
