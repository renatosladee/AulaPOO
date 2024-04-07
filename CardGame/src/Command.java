public abstract class Command
{
    public int input;
    public abstract String description();
    public abstract void Action();

    public Command(int input)
    {
        this.input = input;
    }

    public abstract boolean IsValid();
}