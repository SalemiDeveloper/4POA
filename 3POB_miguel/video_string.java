package exemplo;

public class Principal {

	public static void main(String[] args) {
		
		String str = new String("João Silva");
		str = str.replace("o", "8");
		String[] lista = str.split(" ");
		System.out.println(lista[1] + ", " + lista[0]);
	}
}
