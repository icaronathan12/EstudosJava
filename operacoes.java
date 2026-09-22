public class operacoes {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisaoInteira = a / b; // OBS: O java, ao fazer divisão de dois números do tipo 'int', ele descarta as casas depois da vírgula, printando apenas a divisão inteira.

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão inteira: " + divisaoInteira);

    }
}
