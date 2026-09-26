package EstudoArrayEPrivate;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEx3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<CarroFor_ex3> carros = new ArrayList<>(); // A lista precisa ser do tipo da classe CarroFor_ex3 pra guardar os objetos completos, com modelo e ano, e não apenas String;

        for (int i = 0; i < 2; i ++){
            System.out.printf("===== CADASTRO CARRO %d =====", (i+1));

            System.out.printf("\nDigite o modelo do carro %s: ", (i+1));
            String modelo = scanner.nextLine();

            System.out.printf("Digite o ano do carro %s: ", (i+1));
            int ano = scanner.nextInt();
            scanner.nextLine();

            // Criar o objeto e usar o SETTER pra definir os dados:
            CarroFor_ex3 carro = new CarroFor_ex3();
            carro.setModelo(modelo);
            carro.setAno(ano);

            carros.add(carro);
        }

        // Usar um for-each pra printar. Dentro do for, colocar o tipo e o nome que quero dar ao objeto, que nesse caso vai ser o objeto com o modelo e o ano dentro dele.
        System.out.println("\nCARROS CADASTRADOS");
        for (CarroFor_ex3 carroAtual : carros){
            System.out.printf("Modelo: %s  | Ano: %d%n", carroAtual.getModelo(), carroAtual.getAno());
        }

        scanner.close();

    }
}
