import java.util.Scanner;
public class Exec2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // digitar compra, pago, com(if, else )
    
            System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = scanner.nextInt();
    
        
        System.out.print("Digite o valor pago: R$ ");
        int valorPago = scanner.nextInt();
        
        //processo de pagamento
        
        
        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
            
            
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);
            
            
            int[] notas = {50, 20, 10, 5, 2, 1};
            int[] quantidadeNotas = new int[notas.length];
            
            
            for (int i = 0; i < notas.length; i++) {
                quantidadeNotas[i] = troco / notas[i];
                troco = troco % notas[i];
            }
            
        
            
            System.out.println("Notas para o troco:");
            for (int i = 0; i < notas.length; i++) {
                if (quantidadeNotas[i] > 0) {
                    
                    System.out.println(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
                }
            }
        }
        scanner.close();
    }
}