/**
 * Converte um numero do tipo primitivo para o tipo wrapper.
 *
 */

import java.util.Scanner;

public class TarefaWrapper {
    public static void main(String[] args) {
        converterParaWrapper();
    }

    public static void converterParaWrapper() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        long numLong = sc.nextLong();

        Long wrapperLong = numLong;

        System.out.println("Número: " + wrapperLong);
    }
}
