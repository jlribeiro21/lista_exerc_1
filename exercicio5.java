import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor em metros: ");
        double metros = entrada.nextDouble();
        
        double centimetros = metros * 100;
        
        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");
        
        entrada.close();
    }
}