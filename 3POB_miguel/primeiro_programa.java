package exemplo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num1, num2, res;
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		res = num1+num2;
		
		System.out.println(res);

	}

}
