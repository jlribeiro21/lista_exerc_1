import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, pesoIdeal;
        String genero;
        
        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();
        
        System.out.print("Digite seu gênero (M para masculino ou F para feminino): ");
        genero = sc.next();
        
        if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (genero.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Gênero inválido.");
            sc.close();
            return;
        }
        
        System.out.printf("Seu peso ideal é %.2f kg.", pesoIdeal);
        
        sc.close();
    }
}
