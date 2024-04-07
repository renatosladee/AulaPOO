public class Card extends  Item
{
    private int manaCost;
    private String description;

    public Card(float price, String name, int manaCost, String description)
    {
        super(price, name);

        this.manaCost = manaCost;
        this.description = description;
    }
}
