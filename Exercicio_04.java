package Challenge;

import java.util.Scanner;
public class Exercicio_04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("<<< Sistema de notas >>> ");
		System.out.println("Digite a nota: ");
		
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		double media = (nota1+nota2)/2;
		System.out.println(media);
		
		if (media >=7) {
			System.out.println("Aprovado! Parabens!");
		}else if (media <=4.9) {
			System.out.println("Reprovado!");
		}else {
			System.out.println("Recuperacao");
		}
	}

}
