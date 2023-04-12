import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        double raio = entrada.nextDouble();
        
        double area = Math.PI * raio * raio;
        
        System.out.println("A área do círculo é: " + area);
        
        entrada.close();
    }
}
