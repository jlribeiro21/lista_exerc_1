import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, pesoIdeal;
        
        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();
        
        pesoIdeal = (72.7 * altura) - 58;
        
        System.out.printf("Seu peso ideal é %.2f kg.", pesoIdeal);
        
        sc.close();
    }
}
