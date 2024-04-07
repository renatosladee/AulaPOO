public class Command_AddCardToDeck extends Command
{
    public Command_AddCardToDeck(int input) {
        super(input);
    }

    @Override
    public boolean IsValid() {
        return Main.players.isEmpty() == false;
    }

    @Override
    public String description() {
        return "Add a card to a deck";
    }

    @Override
    public void Action()
    {
        if(Main.players.isEmpty())
        {
            System.out.println("ADD A PLAYER FIRST");
            return;
        }

        System.out.println("CREATING A DECK!");
        System.out.println("CHOOSE A OWNER:");
        Player selectedPlayer = Main.GetPlayer();

        var deck = selectedPlayer.GetDeck();
        AddCardToDeck(deck);
    }

    private void AddCardToDeck(Deck deck)
    {
        var selectedCard = Main.GetCard();
        deck.AddCard(selectedCard);

        var input = Main.GetUserInput("Add another card? Y / N");
        if(input.equalsIgnoreCase("Y"))
        {
            AddCardToDeck(deck);
        }
    }
}