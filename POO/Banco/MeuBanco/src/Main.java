import cliente.Cliente;
import Banco.banco;

public class Main {
    
    public static void main(String[] args){
    
    Cliente C1 = new Cliente();
        Banco B1 = new Banco();
        
        C1.setNome("Bruno");
        B1.setCliente(C1);
        
        Banco B2 = new Banco();
        B2.setNomeCliente("Sete");
    
    
    }
    
}
