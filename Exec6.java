import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new scaner(System.in);
        Random random = new Random();
        
        System.out.print("Digite o primeiro numero inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        int numero2 = scanner.nextInt();
        
        // indentificar menor e maior
        
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);
        
        //gerar numero aleatorio entre o menor e maior (inclusive)
        
        int numeroSorteado = random.nextint(maior - menor +1) + menor;
        
        // Verificar se é par ou impar
        
        if (numeroSorteado % 2 == 0) {
            System.out.println("numero sorteado: " + numeroSorteado + "(par)");
            
        } else { 
            System.out.println("Numero sorteado: " + numeroSorteado + "(impar)");
        }
        
        
    
     scanner.close();
}