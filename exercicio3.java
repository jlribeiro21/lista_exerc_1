import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A soma dos números é " + soma);
        
        entrada.close();
    }
}
