public class CartaPai {

    protected String titulo;
    protected int custoMana;
    protected String cor;
    protected int ID;
    protected String descricao;
    protected String tipo;
    protected String status;

    public void spawnar(){
        System.out.println("Você desceu a carta...");
    }

    public void destruir(){
        System.out.println("Você exilou a carta...");
    }

}
