import java.util.Scanner;

public class Exercicio03ConsumoRacaoPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do saco de ração em kg: ");
        double pesoKg = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.print("Digite o consumo diário do cão em gramas: ");
        double consumoDiario = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        double totalGramas = pesoKg * 1000.0;
        double consumoCincoDias = consumoDiario * 5.0;
        double sobra = totalGramas - consumoCincoDias;

        System.out.printf("Quantidade de ração após 5 dias: %.2f g%n", sobra);

        scanner.close();
    }
}
