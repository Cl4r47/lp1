/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest4clara;

import java.util.Scanner;

public class Quest4clara {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int qtDigitos = 0;
        System.out.println("Digite um número: ");
        n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Deve ser informado um número maior ou igual a 0!");
        } else {
            if (n == 0) {
                qtDigitos = 1;
            } else {
                while (n > 0) {
                    n /= 10;
                    qtDigitos++;
                }
            }
            System.out.println("A quantidade de dígitos foram: " + qtDigitos);
        }
    }

}
