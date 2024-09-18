
import java.util.Scanner;


public class Atvd4 {
    public static void main(String[] args) {
        // Scanner para obter a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicitar os valores inicial e final ao usuário
        System.out.print("Informe o valor inicial: ");
        int inicio = sc.nextInt();
        
        System.out.print("Informe o valor final: ");
        int fim = sc.nextInt();
        
        int soma = 0;
        
        // Laço para somar os números pares no intervalo
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) { // Verifica se o número é par
                soma += i; // Soma o número par
            }
        }
        
        // Exibir a soma dos números pares
        System.out.println("A soma dos números pares entre " + inicio + " e " + fim + " é: " + soma);
        
        sc.close();
    }
}

