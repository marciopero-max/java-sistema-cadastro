import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Remover pessoa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                cadastro.cadastrar(new Pessoa(nome, idade));
                System.out.println("Pessoa cadastrada com sucesso!");

            } else if (opcao == 2) {
                cadastro.listar();

            } else if (opcao == 3) {
                System.out.print("Nome da pessoa para remover: ");
                String nome = sc.nextLine();

                if (cadastro.removerPorNome(nome)) {
                    System.out.println("Pessoa removida com sucesso!");
                } else {
                    System.out.println("Pessoa não encontrada.");
                }
            }

        } while (opcao != 0);

        sc.close();
        System.out.println("Sistema finalizado.");
    }
}
