package tarefagenerics.entities;

/**
 *
 * @author ricar
 */
public abstract class Carro {
    
    private String nome;
    private String marca;
    private String cor;
    private Integer kmRodados;

    public Carro(String nome, String marca, String cor, Integer kmRodados) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.kmRodados = kmRodados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public Integer getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Integer kmRodados) {
        this.kmRodados = kmRodados;
    }
    
    public void Ligar() {
        System.out.println("Carro ligado!");
    }
    
    public void Desligar() {
        System.out.println("Carro desligado!");
    }

    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", marca=" + marca + ", cor=" + cor + ", kmRodados=" + kmRodados + '}';
    }
}
