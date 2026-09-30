import java.util.Scanner;

public class Exercicio10CavernaTesouro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade total de moedas de ouro: ");
        int totalMoedas = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número de exploradores: ");
        int exploradores = Integer.parseInt(scanner.nextLine());

        if (exploradores <= 0) {
            System.out.println("O número de exploradores deve ser maior que zero.");
            scanner.close();
            return;
        }

        int moedasPorExplorador = totalMoedas / exploradores;
        int sobraParaLider = totalMoedas % exploradores;

        System.out.println("Cada explorador receberá: " + moedasPorExplorador + " moeda(s).");
        System.out.println("Moedas que sobraram para o líder: " + sobraParaLider + " moeda(s).");

        scanner.close();
    }
}
