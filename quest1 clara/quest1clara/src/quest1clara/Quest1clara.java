/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest1clara;

import java.util.Scanner;
        
public class Quest1clara {

    public static void main(String[] args) {
        float n1, n2, n3, media, recpar, medfinal;
                
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a primeira nota");
        n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota");
        n2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota");
        n3 = teclado.nextFloat();
        media = (n1 + n2 + n3)/3;
        
        if(media>=7){
            System.out.println("Você foi aprovado!");
        }
        
        else {
            System.out.println("Você foi reprovado. Digite a nota da recuperação :");
            recpar = teclado.nextFloat();
            
            medfinal = (media + recpar) /2;
            
           if(media>=5) {
               System.out.println("Você foi aprovado! Sua média finalo foi:" +medfinal);
           }
           else{
               System.out.println("Você foi reprovado. Sua media final foi:" +medfinal);
           }
        }
    }
    
}
