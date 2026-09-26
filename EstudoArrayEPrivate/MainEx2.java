package EstudoArrayEPrivate;

public class MainEx2 {
    public static void main(String[] args){
        Carro_ex2 meuCarro = new Carro_ex2("Corolla", 2019);

        System.out.printf("Comprei um %s do ano %d", meuCarro.getModelo(), meuCarro.getAno());
    }
}
