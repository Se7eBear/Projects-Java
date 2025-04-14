package principal;

import java.util.Scanner;

import alunos.Alunos;


public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Alunos joaozinho = new Alunos();

		joaozinho.SetNome("Joao");
		
                System.out.println(joaozinho.getNome());
                
                joaozinho.Setcpf("82841828266");
                
                System.out.println(joaozinho.getCpf());
               
                

                System.out.println("Digite a nota: ");
                
                joaozinho.SetNota(sc.nextInt());
                
                System.out.println("Sua nota: " + joaozinho.getNota());
                
                sc.close();

                System.exit(0);

	}
}