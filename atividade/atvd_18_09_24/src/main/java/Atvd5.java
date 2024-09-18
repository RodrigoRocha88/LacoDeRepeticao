
import java.util.Scanner;


public class Atvd5 {
    public static void main(String[] args) {
        //Scanner para obter os valores que serão digitados pelo usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicitar os valores inicial e final ao usuário
        System.out.print("Informe o valor inicial: ");
        int inicio = sc.nextInt();
        
        System.out.print("Informe o valor final: ");
        int fim = sc.nextInt();
        
        System.out.println("Números pares entre " + inicio + " e " + fim + " em ordem crescente:");
        
        // Laço para exibir os números pares no intervalo
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) { // Verifica se o número é par
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}

