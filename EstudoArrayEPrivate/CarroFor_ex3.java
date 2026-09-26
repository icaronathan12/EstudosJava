package EstudoArrayEPrivate;

public class CarroFor_ex3 {
    private String modelo;
    private int ano;

    public CarroFor_ex3(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;

    }

    public CarroFor_ex3(){};

    // GETTERS pra ler os dados:
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }

    //SETTERS pra definir ou alterar os dados:
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
}
