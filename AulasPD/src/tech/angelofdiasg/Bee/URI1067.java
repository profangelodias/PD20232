package tech.angelofdiasg.Bee;

import java.util.Scanner;

public class URI1067 {

	public static void main(String[] args) {
		int valorInteiro;
		Scanner leitor = new Scanner(System.in);
		valorInteiro = leitor.nextInt();
		int i = 1;
		while (i <= valorInteiro) {
			if (i % 2 !=0) {
				System.out.println(i);
			}
			i++;
		}
		
//		for (int i = 1; i <= valorInteiro ; i++) {
//			if (i % 2 !=0) {
//				System.out.println(i);
//			}
//		}

	}

}
