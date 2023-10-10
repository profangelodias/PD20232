package tech.angelofdiasg.Bee;

import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		int peso1, peso2, peso3;
		
		Scanner leitor = new Scanner(System.in);
		nota1 = leitor.nextDouble();
		nota2 = leitor.nextDouble();
		nota3 = leitor.nextDouble();
		peso1 = 2;
		peso2 = 3;
		peso3 = 5;
		media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))/(peso1 + peso2+peso3);
		System.out.println(String.format("MEDIA = %.1f", media));

	}

}
