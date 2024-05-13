/*
Construa um programa onde o usuário forneça 10 (dez) números inteiros e calcule
a soma desses valores.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer valorDigitado;
        Integer soma = 0;
        Integer contador = 0;

        while (contador < 10) {
            System.out.println("Digite o valor do índice (" + contador + "):");
            valorDigitado = leitor.nextInt();
            soma = soma + valorDigitado;

            contador++;
        }

        System.out.println("O resultado da soma é: " + soma);
    }
}
