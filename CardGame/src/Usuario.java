public class Usuario {
    protected String nome;
    protected int idade;
    protected int documento;

    public Usuario(String nome, int idade, int documento){
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
        System.out.println("nome + idade + documento);
    }

}
