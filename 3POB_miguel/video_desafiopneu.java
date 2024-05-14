package exemplo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Desafio do pneu
		int p1, p2, dif;
		Scanner in = new Scanner(System.in);
		p1 = in.nextInt();
		p2 = in.nextInt();
		dif = p1 - p2;
		System.out.println(dif);
		in.close();
	}
}
