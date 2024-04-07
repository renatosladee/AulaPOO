import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        CartaPai carta = new CartaPai();

        do {
            System.out.println("O que deseja fazer?: ");
            System.out.println("1. cadastrar carta");
            System.out.println("2. criar deck");
            System.out.println("3. adicionar carta ao deck");
            System.out.println("4. Sair");
            System.out.print("Digite uma opção (1,2,3 ou 4);");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("cadastrar carta.");
                    System.out.println("Digite o nome da carta:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o modelo do carro:");
        String custoMana = scanner.nextLine();
            CartaPai carta = new CartaPai(titulo,custoMana);
                    break;
                case 2:
                    System.out.println("Você escolheu a Funcionalidade 2.");
                    break;
                case 3:
                    System.out.println("Você escolheu a Funcionalidade 3.");
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }

        } while (escolha != 4);

        scanner.close();
    }
}