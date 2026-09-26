package EstudoArrayEPrivate;

public class MainEx1 {
    public static void main(String[] args){
        Produto_ex1 produto1 = new Produto_ex1("Notebook", 3000.0);

        System.out.printf("O %s custa R$ %.2f", produto1.getNome(), produto1.getPreco());
    }
}
