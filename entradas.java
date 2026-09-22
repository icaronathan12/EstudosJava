import java.util.Locale;
import java.util.Scanner; //Importando a ferramenta do input

public class entradas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Leitura do texto (STRING).

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Leitura do número inteiro (INT).

        System.out.print("Digite sua altura (Ex: 1.70): ");
        double altura = scanner.nextDouble(); // Leitura do número decimal (DOUBLE).

        scanner.nextLine(); // Limpa o buffer e evita que deixe um ENTER guardado. 
        //OBS: Lembrar de fazer isso sempre que tiver usado o scanner pra ler int ou double e em seguida for ler uma string.

        System.out.print("Digite a posição em que joga: ");
        String posicao = scanner.nextLine();

        System.out.print("Digite seu cpf: ");
        String cpf = scanner.nextLine(); // Leitura do CPF como string, já que pode começar com 0 e é maior do que o tipo 'int' suporta (10 dígitos)
        System.out.println("\nDADOS DE CADASTRO DO ATLETA\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura);
        System.out.println("Posição: " + posicao);
        System.out.println("CPF: " + cpf);

        scanner.close();
    }

}
