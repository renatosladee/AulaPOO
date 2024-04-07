public class Item {
    public int id;
    private float price;
    public String name;

    public Item(float price, String name)
    {
        this.id = Main.cards.size();
        this.price = price;
        this.name = name;
    }
}
