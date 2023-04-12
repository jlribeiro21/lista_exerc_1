import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do seu salário por hora: ");
        double salarioPorHora = entrada.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = entrada.nextDouble();
        
        double salarioMensal = salarioPorHora * horasTrabalhadas;
        
        System.out.println("O seu salário no referido mês é: " + salarioMensal);
        
        entrada.close();
    }
}
