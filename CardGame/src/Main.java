import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Player> players = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static  ArrayList<Card> cards;

    public static ArrayList<Command> commands = new ArrayList<>();

    public static void main(String[] args)
    {
        CreateCards();

        commands.add(new Command_CreatePlayer(0));
        commands.add(new Command_CreateDeck(1));
        commands.add(new Command_AddCardToDeck(2));
        commands.add(new Command_Quit(3));

        WaitForCommand();
    }

    public static void WaitForCommand() {

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter Command: ");

        for (Command command : commands)
        {
            if(command.IsValid())
                System.out.println(command.input + " -> " + command.description());
        }

        int userInput = scanner.nextInt();
        scanner.nextLine();

        for (Command command : commands)
        {
            if(userInput == command.input && command.IsValid())
            {
                command.Action();
                WaitForCommand();
            }
        }

        System.out.println("Invalid input");
        WaitForCommand();
    }

    public static String GetUserInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static Player GetPlayer()
    {
        System.out.println("Available players");
        for (Player player : players)
        {
            System.out.println(player.id + " -> " + player.name);
        }

        int userInput = scanner.nextInt();
        scanner.nextLine();

        for (Player player : players)
        {
            if(userInput == player.id)
            {
                return player;
            }
        }

        return GetPlayer();
    }

    public static Card GetCard()
    {
        System.out.println("Available cards");
        for (Card card : cards)
        {
            System.out.println(card.id + " -> " + card.name);
        }

        int userInput = scanner.nextInt();
        scanner.nextLine();

        for (Card card : cards)
        {
            if(userInput == card.id)
            {
                return card;
            }
        }

        return GetCard();
    }

    private static void CreateCards()
    {
        cards = new ArrayList<>();

        cards.add(new Card(100, "Land", 1, "A Card"));
        cards.add(new Card(100, "Elf", 1, "A Card"));
        cards.add(new Card(100, "Archer", 1, "A Card"));
        cards.add(new Card(100, "Human", 1, "A Card"));
        cards.add(new Card(100, "Orc", 1, "A Card"));
        cards.add(new Card(100, "Priest", 1, "A Card"));
        cards.add(new Card(100, "Rat", 1, "A Card"));
        cards.add(new Card(100, "Hammer", 1, "A Card"));
        cards.add(new Card(100, "Socrates", 1, "A Card"));
        cards.add(new Card(100, "Scourge", 1, "A Card"));
        cards.add(new Card(100, "Sword", 1, "A Card"));
        cards.add(new Card(100, "Bow", 1, "A Card"));
        cards.add(new Card(100, "Glass", 1, "A Card"));
        cards.add(new Card(100, "Shayamalan", 1, "A Card"));
    }
}