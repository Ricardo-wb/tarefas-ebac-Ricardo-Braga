/**
 * Classe para criar objetos do tipo carro.
 *
 *
 * @author Ricardo Braga
 */
public class Carro {
    private int codigo;
    private String marca;
    private String cor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mudarCor(String cor) {
        setCor(cor);
        System.out.println("A nova cor do carro é " + getCor() + "!");
    }
}
