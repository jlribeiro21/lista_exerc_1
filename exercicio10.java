import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = entrada.nextDouble();
        
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
        
        entrada.close();
    }
}
