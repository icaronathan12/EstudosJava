
import java.util.ArrayList; //Importa a classe ArrayList (Listas).

public class Listas {

    ///Métodos da ArrayList:
    /// lista.add("Item"); - Adiciona um elemento ao final da lista;
    /// lista.get(0); - Pega o elemento da posição;
    /// lista.size(); - Retorna quantos elementos existem na array;
    /// lista.remove(0); Remove o elemento pelo índice ou pelo valor;

    public static void main(String[] args) {
        // Criando a primeira lista de nomes (Strings):
        ArrayList<String> frutas = new ArrayList<>();

        // Adicionando os elementos:
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");

        // Pegando o primeiro elemento (índice 0):
        System.out.println("Primeira fruta: " + frutas.get(0)); 

        // Vendo o tamanho da lista:
        System.out.println("Quantidade de frutas: " + frutas.size());

    }

}
