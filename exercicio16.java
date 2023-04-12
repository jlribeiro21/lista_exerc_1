import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double area = sc.nextDouble();
        

        double litros = area / 3.0;
        
        int latas = (int) Math.ceil(litros / 18.0);
        
        double preco = latas * 80.0;
        
        System.out.println("Quantidade de latas de tinta necessárias: " + latas);
        System.out.println("Preço total das latas de tinta: R$ " + preco);
        
        sc.close();
    }
}
