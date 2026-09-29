package EstudosTryException;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;

public class MainEx2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<CadastroAlunoComExcecoes_ex2> estudantes = new ArrayList<>();

        // Pergunta a quantidade de estudantes que deseja cadastrar:
        System.out.print("Digite o número de estudantes para cadastro: ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        System.out.println("===== CADASTRO DE ALUNOS =====");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%nAluno %s:%n", i+1);

            System.out.print("Nome: ");
            String nome = leitor.nextLine();
            double nota1;
            double nota2;

            while (true){
                try{
                    System.out.print("Nota 1: ");
                    nota1 = leitor.nextDouble();
                    break;

                } catch (InputMismatchException erro){
                    System.out.println("ERRO: Digite apenas números float!");
                    leitor.nextLine();
                }
            }
            while (true) {
                try {
                    System.out.print("Nota 2: ");
                    nota2 = leitor.nextDouble();
                    leitor.nextLine();
                    break;

                } catch (InputMismatchException erro) {
                    System.out.println("ERRO: Digite apenas números float!");
                    leitor.nextLine();
                }
            }

            CadastroAlunoComExcecoes_ex2 estudante = new CadastroAlunoComExcecoes_ex2();
            estudante.setAluno(nome);
            estudante.setNota1(nota1);
            estudante.setNota2(nota2);

            estudantes.add(estudante);
        }

        System.out.println("======= ESTUDANTES =======");
        for (CadastroAlunoComExcecoes_ex2 estudanteAtual : estudantes){
            System.out.printf("Nome: %s | Média: %.2f | Situação: %s%n",
                    estudanteAtual.getAluno(), estudanteAtual.getMedia(), estudanteAtual.getSituacao());
        }
        leitor.close();
    }
}