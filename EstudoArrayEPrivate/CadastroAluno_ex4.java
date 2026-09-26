package EstudoArrayEPrivate;

public class CadastroAluno_ex4 {
    private String aluno;
    private double nota1;
    private double nota2;

    // Construtor completo:
    public CadastroAluno_ex4(String aluno, double nota1, double nota2){
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public CadastroAluno_ex4(){} // Construtor vazio.

    // Criar os GETTERs:
    public String getAluno() {
        return aluno;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getMedia() {
        return (nota1 + nota2)/2;
    }
    public String getSituacao(){
        if (getMedia() >= 7.0){
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    // Criar os SETTERs:
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
