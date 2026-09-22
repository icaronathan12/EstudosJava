import java.util.ArrayList;

public class LaçoFor {
    public static void main(String[] args) {

    /// for(inicialização, condição, incremento){
    ///     Código que vai se repetir}  
    
    // Imprimir números de 1 a 5:
    for(int i = 1; i <=5; i ++){
        System.out.println("Número: " + i);
    }
    // =======================================

    // for-each: Percorre a lista do primeiro ao último elemento automaticamente:

    ArrayList<String> frutas = new ArrayList<>();
    frutas.add("Maçã");
    frutas.add("Banana");
    frutas.add("Uva");

    for(String fruta : frutas){
        System.out.println("Fruta: "+ fruta);
    }
    
    }
    
}
