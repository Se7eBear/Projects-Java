package main;

import java.util.Scanner;
import teste.Teste1;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Teste1 obj = new Teste1();
        
            System.out.println("Digite seu nome: ");
           
            String nome1 = sc.next();
            obj.setNome1(nome1);
           System.out.println("Seu nome é: "+ obj.getNome1());
        
    
    }
}
