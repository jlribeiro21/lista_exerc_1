import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, excesso, multa;
        
        System.out.print("Digite o peso total de peixes pescados: ");
        peso = sc.nextDouble();
        
        if (peso <= 50) {
            excesso = 0;
            multa = 0;
            System.out.println("Não houve excesso de peso. Não há multa a pagar.");
        } else {
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.printf("Excesso de peso: %.2f kg. Multa a pagar: R$ %.2f.%n", excesso, multa);
        }
        
        sc.close();
    }
}
