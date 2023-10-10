package tech.angelofdiasg.Bee;

import java.util.Locale;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
	
		double nota1, nota2, media, peso1, peso2;
		Scanner leitor = new Scanner(System.in);
		nota1 = leitor.nextDouble();
		nota2 = leitor.nextDouble();
		peso1 = 3.5;
		peso2 = 7.5;
		media = ((nota1 * peso1) + (nota2 * peso2))/(peso1 + peso2);
		System.out.println(String.format("MEDIA = %.5f" , media));
		//leitor.close();
	}

}
