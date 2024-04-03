public class CartaMagica extends CartaPai{
    private String efeito;
    private String tipoDeEfeito;

    public void ativarEfeito(){
        System.out.println("Você ativou o efeito " + efeito + "do tipo " + tipoDeEfeito + ".");
    }

    public void irCemiterio(){
        System.out.println("A carta foi para o cemitério.");
    }
}
