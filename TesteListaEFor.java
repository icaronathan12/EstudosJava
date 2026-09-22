import java.util.ArrayList;

public class TesteListaEFor {
    public static void main(String[] args) {
        // Lista pra armazenar os alunos:
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Pedro");
        alunos.add("Maria");
        alunos.add("Icaro");
        alunos.add("Barbara");

        // Usando for tradicional, .size() e .get():
        System.out.println("===== Usando for tradicional =====");
        for(int i = 0; i < alunos.size(); i ++){
            System.out.println("Aluno " + (i + 1) + ": " + alunos.get(i));
        }

        // Usando for-each:
        System.out.println("===== Usando for-each =====");
        for(String aluno : alunos){
            System.out.println("Nome: " + aluno);
        }

    }
}
