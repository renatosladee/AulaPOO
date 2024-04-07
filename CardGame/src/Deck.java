import java.util.ArrayList;

public class Deck
{
    public String name;
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck(String name)
    {
        this.name  = name;

        System.out.println("Created Deck: " + name);
    }

    public void AddCard(Card card)
    {
        cards.add(card);
        System.out.println(card.name + " was added to " + name + " deck");
    }
}