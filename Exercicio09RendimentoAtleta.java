import java.util.Scanner;

public class Exercicio09RendimentoAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em km: ");
        double distanciaKm = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.print("Digite o tempo gasto em minutos: ");
        double tempoMinutos = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        if (tempoMinutos <= 0) {
            System.out.println("O tempo deve ser maior que zero.");
            scanner.close();
            return;
        }

        double tempoHoras = tempoMinutos / 60.0;
        double velocidadeKmh = distanciaKm / tempoHoras;
        double velocidadeMs = (distanciaKm * 1000.0) / (tempoMinutos * 60.0);

        System.out.printf("Velocidade média: %.2f km/h%n", velocidadeKmh);
        System.out.printf("Velocidade média: %.2f m/s%n", velocidadeMs);

        scanner.close();
    }
}
