import java.util.Scanner;

public class Exercicio02DivisaoLucroFeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total arrecadado: R$ ");
        double totalArrecadado = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        double valorGuardado = totalArrecadado * 0.10;
        double valorRestante = totalArrecadado - valorGuardado;
        double valorPorAmigo = valorRestante / 3.0;

        System.out.printf("Valor guardado para comprar limões: R$ %.2f%n", valorGuardado);
        System.out.printf("Valor que cada amigo receberá: R$ %.2f%n", valorPorAmigo);

        scanner.close();
    }
}
