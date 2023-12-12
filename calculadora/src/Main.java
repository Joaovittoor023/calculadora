import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operacao operacao = new Operacao();

        System.out.println("Escolha o primero numero");
        double num1 = sc.nextDouble();

        System.out.println("Digite qual vai ser a operação");
        System.out.println("(1) SOMA\n" + "(2) SUBTRAÇÃO\n" + "(3) DIVISÃO\n" + "(4) MULTIPLICAÇÃO");
        int esscolha = sc.nextInt();

        System.out.println("Escolha o segundo numero");
        double num2 = sc.nextDouble();

        switch (esscolha) {
            case  1:
                System.out.println(operacao.soma(num1, num2));
                break;
            case  2:
                System.out.println(operacao.subtracao(num1, num2));
                break;
            case  3:
                System.out.println(operacao.divisao(num1, num2));
                break;
            default:
                System.out.println(operacao.multiplicacao(num1, num2));
                break;
        }
        System.out.println();
        sc.close();
    }
}