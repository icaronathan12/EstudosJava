package EstudoArrayEPrivate;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class MainEx4 {

    public static void main(String[] args){
        ArrayList<CadastroAluno_ex4> alunos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < 2; i++){
            System.out.printf("===== Aluno %s ===== %n%n", (i + 1));
            System.out.print("Nome: ");
            String nome = leitor.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = leitor.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = leitor.nextDouble();
            leitor.nextLine();

            // Criar o objeto e usa o SETTER pra definir os dados:
            CadastroAluno_ex4 aluno = new CadastroAluno_ex4();
            aluno.setAluno(nome);
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);

            // Adicionar o objeto à lista:
            alunos.add(aluno);

        }

        System.out.println("\n===== ALUNOS CADASTRADOS =====\n");
        for (CadastroAluno_ex4 alunoAtual : alunos){
            System.out.printf("Aluno: %s | Média: %s | Situação: %s%n",
                    alunoAtual.getAluno(), alunoAtual.getMedia(), alunoAtual.getSituacao());
        }

        leitor.close();
    }
}
