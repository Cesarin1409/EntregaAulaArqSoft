package Models;

public class Passageiro extends Pessoa {
    protected String numeroPoltrona;
    protected String numeroCartaoEmbarque;

    public Passageiro() {
    }

    public Passageiro(long cpf, String nome, String telefone, String numeroPoltrona, String numeroCartaoEmbarque) {
        super(cpf, nome, telefone);
        this.numeroPoltrona = numeroPoltrona;
        this.numeroCartaoEmbarque = numeroCartaoEmbarque;
    }

    public String getNumeroPoltrona() {
        return numeroPoltrona;
    }

    public void setNumeroPoltrona(String numeroPoltrona) {
        this.numeroPoltrona = numeroPoltrona;
    }

    public String getNumeroCartaoEmbarque() {
        return numeroCartaoEmbarque;
    }

    public void setNumeroCartaoEmbarque(String numeroCartaoEmbarque) {
        this.numeroCartaoEmbarque = numeroCartaoEmbarque;
    }

    @Override
    public String toString() {
        return "\nPassageiro: " + nome + ",\n cpf: " + cpf + ",\n Numero da poltrona: " + numeroPoltrona
                + ",\n Telefone: "
                + telefone + ", Numero Cartao de Embarque: " + numeroCartaoEmbarque + "\n";
    }

}
