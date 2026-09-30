import java.util.Scanner;

public class Exercicio04PainelSolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de painéis solares instalados: ");
        int quantidadePaineis = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o valor cobrado por kWh: R$ ");
        double valorKwh = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        double geracaoDiaria = quantidadePaineis * 1.2;
        double geracaoMensal = geracaoDiaria * 30.0;
        double economiaMensal = geracaoMensal * valorKwh;

        System.out.printf("Energia gerada em 30 dias: %.2f kWh%n", geracaoMensal);
        System.out.printf("Economia estimada no mês: R$ %.2f%n", economiaMensal);

        scanner.close();
    }
}
