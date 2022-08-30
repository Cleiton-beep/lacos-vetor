package br.senai.sp.jandira;

import java.util.Scanner;

public class lacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int repeticao = 1;
//		
//		while(repeticao <= 5) {
//			System.out.println(repeticao  + " - Cleiton");
//			repeticao++;
//			
//		}
//	}	
//}
//	
//		int valor = 1;
//	    
//	    int n1 = valor * (valor -1);
//
//	    
//	    while (valor > 2) {
//	    	
//	    	valor--;
//	    	n1 = n1 * (valor - 1);
//	        //System.out.println( n1 );
//	    	
//	    }
//	    System.out.println( n1 );
//	
	    Scanner leitor = new Scanner(System.in);
	    String resposta = "s";
	    
	    while (resposta.equalsIgnoreCase("s")) {
	    System.out.println("Legal, mais uma volta. Uhuuuu!!");
	    System.out.println("Quer continuar? (s/n)");
	    resposta = leitor.next();
	    	}
	    System.out.println("Volte sempre!!");
	    }
	    
}