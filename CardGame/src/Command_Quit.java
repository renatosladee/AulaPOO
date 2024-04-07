public class Command_Quit extends Command{
    public Command_Quit(int input) {
        super(input);
    }

    @Override
    public boolean IsValid() {
        return true;
    }

    @Override
    public String description() {
        return "Sair";
    }

    @Override
    public void Action() {
        System.out.println("Exiting application.");
        Main.scanner.close();
        System.exit(0);
    }
}
