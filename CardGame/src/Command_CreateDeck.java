public class Command_CreateDeck extends Command
{
    public Command_CreateDeck(int input) {
        super(input);
    }

    @Override
    public boolean IsValid() {
        return Main.players.isEmpty() == false;
    }

    @Override
    public String description() {
        return "Create deck";
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

        System.out.println("CREATING A DECK FOR " + selectedPlayer.name);
        String deckName = Main.GetUserInput("Deck name: ");

        Deck newDeck = new Deck(deckName);
        selectedPlayer.AddDeck(newDeck);
    }
}
