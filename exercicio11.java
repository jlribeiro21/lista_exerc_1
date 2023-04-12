import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = entrada.nextInt();
        
        System.out.print("Digite um número real: ");
        double numeroReal = entrada.nextDouble();
        
        int produto = 2 * numero1 * (numero2 / 2);
        double soma = 3 * numero1 + numeroReal;
        double cubo = Math.pow(numeroReal, 3);
        
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
        System.out.println("O terceiro elevado ao cubo é: " + cubo);
        
        entrada.close();
    }
}
