import java.util.*;

public class TarefaColecoes {
    public static void main (String[] args) {
        System.out.println("Digite o nome das pessoas: Ex: 'Robson, Andria, jorge, clara'");
        listarNomes();

        System.out.println("Digite o nome e o sexo das pessoas: Ex: 'Odair-m, Ana-f, Clara-f, Mario-m'");
        listarNomeGenero();
    }

    public static void listarNomes() {
        Scanner sc = new Scanner(System.in);
        String nomes = sc.nextLine();

        List<String> listaNomes = new ArrayList<>(Arrays.asList(nomes.split(", ")));
        listaNomes.sort(String::compareTo);

        System.out.println(listaNomes);
    }

    public static void listarNomeGenero() {
        Scanner sc = new Scanner(System.in);

        String pessoas = sc.nextLine();
        List<String> listaPessoas = new ArrayList<>(Arrays.asList(pessoas.split(", ")));

        List<String> listaMulheres = new ArrayList<>();
        List<String> listaHomens = new ArrayList<>();

        for(String pessoa : listaPessoas) {
            if(pessoa.contains("-f")) {
                listaMulheres.add(pessoa);
            }
            if(pessoa.contains("-m")) {
                listaHomens.add(pessoa);
            }
        }

        System.out.println("Lista de pessoas: " + listaPessoas);
        System.out.println("Lista de pessoas do sexo feminino: " + listaMulheres);
        System.out.println("Lista de pessoasdo sexo masculino: " + listaHomens);
    }
}

