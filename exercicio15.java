import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor da sua hora trabalhada: ");
        double valorHora = input.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();
        
        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoRenda = 0.11 * salarioBruto;
        double inss = 0.08 * salarioBruto;
        double sindicato = 0.05 * salarioBruto;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        
        System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
        System.out.printf("\nDesconto do Imposto de Renda (11%%): R$ %.2f", impostoRenda);
        System.out.printf("\nDesconto do INSS (8%%): R$ %.2f", inss);
        System.out.printf("\nDesconto do Sindicato (5%%): R$ %.2f", sindicato);
        System.out.printf("\nSalário Líquido: R$ %.2f", salarioLiquido);
        
        input.close();
    }
}
