import java.util.Scanner;
import Operacao;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operacao operacao = new Operacao();

        System.out.println("Escolha o primero numero");
        double num1 = sc.nextDouble();

        System.out.println("Digite qual vai ser a operação");
        System.out.println("(1) SOMA" /n "(2) SUBTRAÇÃO" /n "(3) DIVISÃO" /n "(4) MULTIPLICAÇÃO");
        int operacao = sc.nextInt();

        System.out.println("Escolha o segundo numero");
        double num2 = sc.nextDouble();

        switch (operacao) {
            case  1:
                System.out.println(soma);
                break;

            case  2:
                System.out.println(subtracao);
                break;

            case  3:
                System.out.println(divisao);
                break;

            default:
                System.out.println(multiplicacao);
                break;

        }


        System.out.println();


        sc.close();

    }
}