import java.util.Scanner;

public class Exercicio05ConversorTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo total em segundos: ");
        int totalSegundos = Integer.parseInt(scanner.nextLine());

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println("Tempo convertido: " + horas + " hora(s), "
                + minutos + " minuto(s) e " + segundos + " segundo(s).");

        scanner.close();
    }
}
