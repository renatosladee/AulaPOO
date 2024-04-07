public class Command_CreatePlayer extends Command
{
    public Command_CreatePlayer(int input) {
        super(input);
    }

    @Override
    public boolean IsValid() {
        return true;
    }

    @Override
    public String description() {
        return "Create a new player";
    }

    @Override
    public void Action()
    {
        System.out.println("ADDING NEW PLAYER!");
        String userName = Main.GetUserInput("Player Name: ");

        for (Player player : Main.players) {
            if (player.name.equals(userName)) {
                System.out.println("Player was already added");
                Main.WaitForCommand();
            }
        }

        Main.players.add(new Player(userName));
    }
}
