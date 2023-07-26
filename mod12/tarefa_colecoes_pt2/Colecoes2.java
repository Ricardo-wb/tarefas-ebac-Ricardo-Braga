import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecoes2 {
    public static void main(String[] args) {
        organizarPorGenero(registrarPessoas());
    }
    public static List registrarPessoas() {
        Scanner sc = new Scanner(System.in);

        List<String> listaPessoas = new ArrayList<>();
        String novo;

        do {
            System.out.println("Digite o nome e o gênero: EX: 'Carlos - M' ou 'Maria - F'");
            String pessoa = sc.nextLine();

            listaPessoas.add(pessoa);

            System.out.print("Deseja inserir um novo registro? ");
            novo = sc.nextLine();
        } while (novo.equalsIgnoreCase("sim"));

        return listaPessoas;
    }

    public static void organizarPorGenero(List listaPessoas) {
        List<String> listaMulheres = new ArrayList<>();
        List<String> listaHomens = new ArrayList<>();

        listaPessoas.forEach(pessoa -> {
            if(pessoa.toString().contains("- M")) {
                listaHomens.add((String) pessoa);
            } else {
                listaMulheres.add((String) pessoa);
            }
        });

        System.out.println();
        System.out.println("Lista de pessoas registradas: " + listaPessoas);
        System.out.println("Lista de mulheres registradas: " + listaMulheres);
        System.out.println("Lista de homens registradas: " + listaHomens);
    }
}
