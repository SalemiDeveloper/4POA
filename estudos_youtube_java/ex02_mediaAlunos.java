/*
Construa um programa onde o usuário forneça o nome e as duas notas de um grupo de 5
alunos. Calcule a média de cada aluno e verifique as seguintes condições:
    -Se a média for maior ou igual a 7, mostre a mensagem "APROVADO"
    -Se a média for menor que 7 e maior que 3, mostre a mensagem "RECUPERAÇÃO"
    -Senão, mostre a mensagem "REPROVADO"
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        Double nota1, nota2;
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 5; i++){

            System.out.println("Digite seu nome: ");
            nome = leitor.next();

            System.out.println("Digite a primeira nota: ");
            nota1 = leitor.nextDouble();

            System.out.println("Digite a segunda nota: ");
            nota2 = leitor.nextDouble();

            Double soma = nota1 + nota2;
            Double media = soma / 2;

            if (media >= 7){
                System.out.println(nome.toUpperCase() + " APROVADO");
            } else if(media < 7 && media > 3){
                System.out.println(nome.toUpperCase() + " RECUPERAÇÃO");
            } else {
                System.out.println(nome.toUpperCase() + " REPROVADO");
            }

            System.out.println("---------------------------------");
        }
    }
}
