public class CartaTerreno extends CartaPai{
    private int qtdadeMana;
    private String corDaMana;
    private boolean virar;

    public void gerarMana(){
        System.out.println("Você gerou " + qtdadeMana + "de mana da cor " + corDaMana + ".");
    }
}
