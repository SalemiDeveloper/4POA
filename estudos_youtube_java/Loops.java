public class Main {
    public static void main(String[] args) {
        //loops FOR e WHILE
        int intfor = 10;
        int intwhile = 8;
        int k = 0;

        for (var i = 0; i < intfor; i++)
        {
            System.out.println("Olá Mundo.");
        }
        
        //no while tem que declarar o i antes (fiz com "k")
        while(k < intwhile)
        {
            System.out.println("Fluminense.");
            k++;
        }
    }
}
