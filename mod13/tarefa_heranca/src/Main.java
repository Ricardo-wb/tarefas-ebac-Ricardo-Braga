public class Main {
    public static void main(String[] args) {
        Pessoa pf = new PessoaFisica("Ricardo", 123456);
        Pessoa pj = new PessoaJuridica("Ricardo", 654321);

        System.out.println(pf);
        System.out.println(pj);
    }
}