public class PessoaJuridica extends Pessoa {
    private int cnpj;

    public PessoaJuridica(String name, int cnpj) {
        super(name);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica: " +
                "nome = " + name +
                " / cnpj = " + cnpj;
    }
}
