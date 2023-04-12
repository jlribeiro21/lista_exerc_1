import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo em MB: ");
        double tamanho = sc.nextDouble();

        System.out.print("Informe a velocidade da sua internet em Mbps: ");
        double velocidade = sc.nextDouble();

        double tempoEmMinutos = (tamanho * 8) / (velocidade * 60);

        System.out.printf("O tempo aproximado de download é de %.2f minutos.", tempoEmMinutos);

        sc.close();
    }
}
