package Challenge;

import java.util.Scanner;
public class Exercicio_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a letra: ");
		char letra = scanner.next().charAt(0);
		
		if (letra == 'F' || letra == 'f') {
			System.out.println("Feminino.");
		}else if (letra == 'M' || letra =='m') {
			System.out.println("Masculino.");
		}else {
			System.out.println("Letra invalida!");
		}
	}			
}		
	 	
	

