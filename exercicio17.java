import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
    double tamanhoArea = sc.nextDouble();

    double litrosNecessarios = tamanhoArea / 6.0;
    litrosNecessarios *= 1.1; // 10% de folga

    int quantidadeLatas = (int) Math.ceil(litrosNecessarios / 18.0);
    double precoLatas = quantidadeLatas * 80.0;

    int quantidadeGaloes = (int) Math.ceil(litrosNecessarios / 3.6);
    double precoGaloes = quantidadeGaloes * 25.0;

    int quantidadeLatasMisturadas = (int) (litrosNecessarios / 18.0);
    double litrosRestantes = litrosNecessarios - (quantidadeLatasMisturadas * 18.0);
    int quantidadeGaloesMisturados = (int) Math.ceil(litrosRestantes / 3.6);
    double precoLatasMisturadas = quantidadeLatasMisturadas * 80.0;
    double precoGaloesMisturados = quantidadeGaloesMisturados * 25.0;
    double precoTotalMisturado = precoLatasMisturadas + precoGaloesMisturados;

    System.out.println("Quantidade de latas de tinta a serem compradas: " + quantidadeLatas);
    System.out.println("Preço total de latas de tinta: R$" + precoLatas);

    System.out.println("Quantidade de galões de tinta a serem comprados: " + quantidadeGaloes);
    System.out.println("Preço total de galões de tinta: R$" + precoGaloes);

    System.out.println("Quantidade de latas de tinta e galões de tinta misturados:");
    System.out.println("Latas: " + quantidadeLatasMisturadas + ", Galões: " + quantidadeGaloesMisturados);
    System.out.println("Preço total de latas de tinta e galões de tinta misturados: R$" + precoTotalMisturado);

    sc.close();
}
}