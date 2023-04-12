import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        System.out.println("O número informado foi " + numero);
        
        entrada.close();
    }
}
