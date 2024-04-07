import java.util.ArrayList;

public class Player
{
    public int id;
    public String name;
    public ArrayList<Deck> decks = new ArrayList<>();

    public Player(String name)
    {
        this.name = name;
        this.id = Main.players.size();

        System.out.println("Player " + name + " was created.");
    }

    public void AddDeck(Deck deck)
    {
        decks.add(deck);
    }

    public Deck GetDeck()
    {
            System.out.println("Available decks");
            for (Deck deck : decks)
            {
                System.out.println(deck.name);
            }

            String userInput = Main.GetUserInput("Selected a deck by name: ");

            for (Deck deck : decks)
            {
                if(userInput.equalsIgnoreCase(deck.name))
                {
                    return deck;
                }
            }
            return GetDeck();
    }
}