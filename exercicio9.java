import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = entrada.nextDouble();
        
        double temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32) / 9);
        
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);
        
        entrada.close();
    }
}
