import java.util.Scanner;

public class Exercicio06FabricacaoCapinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double CUSTO_UNITARIO = 3.50 + 1.50 + 0.80;

        System.out.print("Digite a quantidade de capinhas produzidas: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o preço de venda de cada capinha: R$ ");
        double precoVenda = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        double custoTotal = quantidade * CUSTO_UNITARIO;
        double receitaTotal = quantidade * precoVenda;
        double lucroLiquido = receitaTotal - custoTotal;

        System.out.printf("Custo total de produção: R$ %.2f%n", custoTotal);
        System.out.printf("Lucro líquido do lote: R$ %.2f%n", lucroLiquido);

        scanner.close();
    }
}
