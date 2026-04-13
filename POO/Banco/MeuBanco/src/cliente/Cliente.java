package cliente;


public class Cliente {
    private String nome;
    private int numeroconta; 
    private double saldo;
    
    //SET - Colocar um valor ao um atributo -> Pode ser void 
    public void setNome(String nomeCliente){
        this.nome = nome;
    }
    //GET - pegar um valor de um atributo -> Deve ser do tipo de dado do atributo
    public String getNome(){
    return nome;
    }
    
    public void setNumeroconta(int numeroconta){
        this.numeroconta = numeroconta;
    }
    public int getNumeroconta(){
    return numeroconta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
}
