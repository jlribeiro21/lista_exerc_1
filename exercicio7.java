import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o lado do quadrado: ");
        double lado = entrada.nextDouble();
        
        double area = lado * lado;
        double dobroArea = 2 * area;
        
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + dobroArea);
        
        entrada.close();
    }
}
