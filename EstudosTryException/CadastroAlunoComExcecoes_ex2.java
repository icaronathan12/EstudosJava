package EstudosTryException;

public class CadastroAlunoComExcecoes_ex2 {
    private String aluno;
    private double nota1;
    private double nota2;

    // Construtor completo:
    public CadastroAlunoComExcecoes_ex2(String aluno, double nota1, double nota2){
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Construtor vazio:
    public CadastroAlunoComExcecoes_ex2(){}

    //Criar os GETTERS:
    public String getAluno(){
        return aluno;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public double getMedia(){
        return (nota1 + nota2)/2;
    }

    public String getSituacao(){
        if (getMedia() >= 7){
            return "APROVADO";
        }
        else {
            return "REPROVADO";
        }
    }

    //Criar os SETTERS:
    public void setAluno(String aluno){
        this.aluno = aluno;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
}