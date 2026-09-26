package EstudoArrayEPrivate;

public class Produto_ex1 {
    private String nome;
    private double preco;

    public Produto_ex1(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
}
