import java.util.Scanner;

public class Exercicio08CofrinhoVovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de moedas de R$ 0,10: ");
        int moedas10 = Integer.parseInt(scanner.nextLine());

        System.out.print("Quantidade de moedas de R$ 0,25: ");
        int moedas25 = Integer.parseInt(scanner.nextLine());

        System.out.print("Quantidade de moedas de R$ 0,50: ");
        int moedas50 = Integer.parseInt(scanner.nextLine());

        double total = (moedas10 * 0.10) + (moedas25 * 0.25) + (moedas50 * 0.50);

        System.out.printf("Valor total poupado: R$ %.2f%n", total);

        scanner.close();
    }
}
