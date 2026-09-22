import java.util.Scanner;

public class CadastroAluno {
    // É importante declarar essas variáveis aqui pra poder usá-las em qualquer função ou módulo.
    String nome;
    String matricula;
    String curso;
    String turno;

    Scanner scanner = new Scanner(System.in);

    // Função de leitura dos dados:
    public void dados() {

        System.out.print("\nNome: ");
        this.nome = scanner.nextLine();

        System.out.print("Matricula: ");
        this.matricula = scanner.nextLine();

        System.out.print("Curso: ");
        this.curso = scanner.nextLine();

        System.out.print("Turno: ");
        this.turno = scanner.nextLine();

    }

    // Função de apresentação dos dados: 
    public void apresentar() {
        System.out.println("\nDADOS DO ALUNO\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("Turno: " + this.turno);
        System.out.println("====================");
    }
}