import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos coeficientes
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        // Verificação dos coeficientes
        if (a == 0 && b == 0 && c != 0) {
            
            System.out.println("Coeficientes informados incorretamente.");
            
            
        } else if (a == 0 && b != 0) {
            
            
            // Equação de primeiro grau: bx + c = 0 => x = -c/b
            
            double raiz = -c / b;
            
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("Raiz: " + raiz);
            
            
        } else {
            
            // Equação de segundo grau
            
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
                
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("Raiz: " + raiz);
                
                
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                
                
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                
                System.out.println("Raiz 1: " + raiz1);
                
                System.out.println("Raiz 2: " + raiz2);
            }
        }

        scanner.close();
    }
}

                
                