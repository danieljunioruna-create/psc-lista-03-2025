import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        final double PI = 3.141592; // valor de pi pelas minhas pesquisas
        
        System.out.print("Digite o código da operação (1 - perímetro, 2 - área, 3 - volume): ");
        int operacao = scanner.nextInt();
        
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        
        switch (operacao) {
            case 1:
                // Perímetro do círculo: 2 π R
                
                double perimetro = 2 * PI * raio;
                System.out.printf("Perímetro do círculo: %.4f\n", perimetro);
                
                
                break;
            case 2:
                // Área do círculo
                
                double area = PI * raio * raio;
                System.out.printf("Área do círculo: %.4f\n", area);
                break;
                
            case 3:
                // Volume da esfera
                
                double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
                System.out.printf("Volume da esfera: %.4f\n", volume);
                break;
            default:
                System.out.println("Erro: código da operação inválido.");
        }
        scanner.close();

                
                