public class PessoaFisica extends Pessoa {
    private int cpf;

    public PessoaFisica(String name, int cpf) {
        super(name);
        this.cpf = cpf;
    }
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica: " +
                "nome = " + name +
                " / cpf = " + cpf;
    }
}
