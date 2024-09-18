
import java.util.Scanner;


public class Atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pede ao usuário o valor do número a ser calculado
        System.out.print("Informe um número para gerar a tabuada: ");
        int numero = sc.nextInt();
        
        //Calcula o número
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {//Laço para exibir a tabuada de 1 a 10
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
