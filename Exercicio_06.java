package Challenge;

import java.util.Scanner;

public class Exercicio_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		System.out.println("Voce esta no interrogatorio. Responda apenas com 'sim' ou 'nao'! ");
		System.out.print("Voce telefonou pra vitima? ");
		String resposta = scanner.nextLine();
		if (resposta.equalsIgnoreCase("sim")) {
			count ++;
		}
		System.out.print("Esteve no local do crime? ");
		resposta = scanner.nextLine();
		if (resposta.equalsIgnoreCase("sim")) {
			count ++;
		}
		System.out.print("Mora perto da vitima? ");
		resposta = scanner.nextLine();
		if (resposta.equalsIgnoreCase("sim")) {
			count ++;
		}        		
		System.out.print("Devia para a vitima? ");
		resposta = scanner.nextLine();
		if (resposta.equalsIgnoreCase("sim")) {
			count ++;
		}
		System.out.print("Ja trabalhou com a vitima? ");
		resposta = scanner.nextLine();
		if (resposta.equalsIgnoreCase("sim")) {
			count ++;
		}
		
		if (count < 2) {
			System.out.println("Inocente");
		} else if (count == 2) {
			System.out.println("Suspeita");
		} else if (count ==5) {
			System.out.println("Assasino! Voce esta preso.");
		} else {
			System.out.println("Cumplice");
		}
		
	}	
		
		
		
		
		
	
		
		
		
		
		
		
		        
		
}