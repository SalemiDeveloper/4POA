package exemplo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float n1, n2, media;
		
		Scanner in = new Scanner(System.in);
		
		n1 = in.nextFloat();
		n2 = in.nextFloat();
		
		media = (n1 + n2) / 2;
		
		System.out.println(media);
		in.close();
	}

}
