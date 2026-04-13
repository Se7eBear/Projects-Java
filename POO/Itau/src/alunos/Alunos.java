package alunos;

public class Alunos {
    
    private String nome;
    private String cpf;
    private int nota;
    
    public void SetNome(String nomeAluno){
        nome = nomeAluno;
    }

    public void Setcpf(String cpfAluno){
        cpf = cpfAluno;
    }

    public void SetNota(int notaAluno){
        nota = notaAluno;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getNota(){
        return nota;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    
    
}
            

