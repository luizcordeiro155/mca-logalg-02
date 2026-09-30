import java.util.Scanner;

public class Exercicio01MagoPocoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de poções de cura: ");
        int pocoesCura = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a quantidade de poções de energia: ");
        int pocoesEnergia = Integer.parseInt(scanner.nextLine());

        int manaTotal = (pocoesCura * 15) + (pocoesEnergia * 25);

        System.out.println("Total de mana gerado: " + manaTotal + " pontos");

        scanner.close();
    }
}
