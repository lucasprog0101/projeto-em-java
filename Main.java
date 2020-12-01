package projeto_1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("vamos fazer um pequeno formulario:");
		System.out.println("qual é seu nome:");
        String name = in.nextLine();
        System.out.println("qual é sua idade:");
        String idade = in.nextLine();
        System.out.println("qual é seu sexo:");
        String sexo = in.nextLine();
        
        System.out.println(name);
        
        System.out.println(idade);
        
        switch(sexo){
        case "masculino":
   
        System.out.println("masculino");

        break;
        case "feminino":
        
        System.out.println("feminino");
        	
        break;
        default:
        	
        System.out.println("não quero dizer");
        
        }
   
	}
}
