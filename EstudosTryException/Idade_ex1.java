package EstudosTryException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Idade_ex1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("===== Cadastro de idade =====");

        try{
            // Ele vai tentar executar:
            System.out.print("Digite sua idade: ");
            int idade = leitor.nextInt();

            System.out.println("Idade registrada: " + idade);
        } catch (InputMismatchException erro){
            // Se der muiú, algum erro de digitação que não seja da tipagem pedida, ele printa:
            System.out.println("ERRO: Digite apenas números inteiros: ");

        }
    }
}
