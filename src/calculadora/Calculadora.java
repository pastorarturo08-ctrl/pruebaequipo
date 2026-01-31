
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = sc.nextInt();

        Suma suma = new Suma();
        System.out.println("Suma: " + suma.calculadora(a, b));
        
        Resta resta = new Resta();
        System.out.println("Resta: " + resta.calculadora(a, b));
    }
    
}
