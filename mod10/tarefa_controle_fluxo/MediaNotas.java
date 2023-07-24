import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        lerNotas();
        exibirNotaFinal();
    }

    private static double nota1;
    private static double nota2;
    private static double nota3;
    private static double nota4;

    public static void lerNotas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Digite as notas do aluno: ***");

        System.out.print("Primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.print("Quarta nota: ");
        nota4 = sc.nextDouble();
    }
    public static double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void exibirNotaFinal() {
        double media = calcularMedia();

        if(media >= 7) {
            System.out.println("Média final do aluno: " + String.format("%.2f", media) + ". APROVADO!");
        }
        else if(media >= 5) {
            System.out.println("Média final do aluno: " + String.format("%.2f", media) + ". RECUPERAÇÂO!");
        } else {
            System.out.println("Média final do aluno: " + String.format("%.2f", media) + ". REPROVADO!");
        }
    }
}
