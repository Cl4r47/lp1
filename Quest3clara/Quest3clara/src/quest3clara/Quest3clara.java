
package quest3clara;

import java.util.Scanner;
public class Quest3clara {

    public static void main(String[] args) {
      
        int  x, m1, m2, h1, h2, s1, s2, stotal1,stotal2 = 0 ,soma,dif, hora, minuto,segundo;
        Scanner teclado= new Scanner(System.in);

        System.out.println("Digite o primeiro horário:\nh:");
        h1 = teclado.nextInt();
        System.out.println("m:");
        m1 = teclado.nextInt();
        System.out.println("s:");
        s1 = teclado.nextInt();
        System.out.println("Digite o segundo horário:\nh:");
        h2 = teclado.nextInt();
        System.out.println("m:");
        m2 = teclado.nextInt();
        System.out.println("s:");
        s2 = teclado.nextInt();
        

        stotal1 = (h1 * 3600 + m1 * 60 + s1);
        stotal2 = (h2 * 3600 + m2 * 60 + s2);
        
        soma = stotal1 + stotal2;
        
        if (stotal1 > stotal2) {
            dif = stotal1 - stotal2;
        } else {
            dif = stotal2 - stotal1;
        }
            
        
        System.out.println("Escolha a operação:\n1: soma\n0: diferença");
        x = teclado.nextInt();
        
        if (x == 1) {
            hora = soma / 3600;
            minuto = (soma % 3600) / 60;
            segundo = (soma % 3600) % 60;
            System.out.println("A soma dos dois horários é:\n" + hora + ":" + minuto + ":" + segundo);
        } else {
            hora = dif / 3600;
            minuto = (dif % 3600) / 60;
            segundo = (dif % 3600) % 60;
            System.out.println("A diferença dos dois horários é:\n" + hora + ":" + minuto + ":" + segundo);
        }
        
    }
} 
    
    
