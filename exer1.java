import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        //leitura dos 3 numeros 
        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Disgite o terceiro numero:: ");
        double numero3 = scanner.nextDouble();
        
        // Encontrar o maior numero
        
        double maior = numero1;
        if(numero2 > maior) {
            maior = numero2;
            
        }
        if (numero3 > maior) {
            maior = numero3;
        }
    
        // Encontrar o menor numero
        
        double menor = numero1;
        if( numero2 < menor) {
            menor = numero2;
            
        }
        if( numero3 < menor) {
            menor = numero3;
        }
        
        //calcular a media aritmetica
        
        double media = (numero1 + numero2 + numero3) / 3;
        
        //exibiçao do resultado
        
        System.out.println("maior numero: " + maior);
        System.out.println("menor numero: " + menor);
        System.out.println("media aritmtica:" + media);
        
        scanner.close();
        
        
        

        
        

    }
}