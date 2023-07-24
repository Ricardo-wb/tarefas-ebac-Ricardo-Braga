/**
 * Calcular a média das notas.
 *
 * @author Ricardo Braga
 */

public class CalculoMedia {
    public static void main(String[] args) {
        calcularMedia();
    }

    private static void calcularMedia() {
        double nota1 = 9.50;
        double nota2 = 8.90;
        double nota3 = 9.00;
        double nota4 = 10.00;

        double notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(notaFinal);
    }
}
