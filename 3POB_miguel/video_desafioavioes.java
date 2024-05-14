package exemplo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Desafio Aviões de Papel
		int qTF, qFE, qE;
		
		Scanner in = new Scanner(System.in);
		qTF = in.nextInt();
		qFE = in.nextInt();
		qE = in.nextInt();
		
		if (qFE * qE <= qTF) {
			System.out.println("sim");
		} else {
			System.out.println("não");
		}
		in.close();
	}
}
