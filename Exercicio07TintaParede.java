import java.util.Scanner;

public class Exercicio07TintaParede {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da parede em metros: ");
        double largura = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.print("Digite a altura da parede em metros: ");
        double altura = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        double area = largura * altura;
        double litrosNecessarios = area / 3.0;

        System.out.printf("Área total da parede: %.2f m²%n", area);
        System.out.printf("Quantidade de tinta necessária: %.2f litro(s)%n", litrosNecessarios);

        scanner.close();
    }
}
