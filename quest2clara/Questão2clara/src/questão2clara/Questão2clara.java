
package questão2clara;
import java.util.Scanner;
public class Questão2clara {

    
    public static void main(String[] args) {
        float criteA, criteB;
        int livros;
        Scanner teclado = new Scanner (System.in);
         System.out.println("Digite a quantidade de livros desejada: ");
         livros = teclado.nextInt();
         criteA = (float) ((livros*0.25) + 7.50);
         criteB = (float) ((livros*0.50) + 2.50);
         
         if(criteA==criteB){
           System.out.println("Os dois planos têm as mesmas funcionalidades");
          }
         else {
             if(criteA>criteB){
                 System.out.println("O plano B é a melhor opção.");
             }
             else{
                 System.out.println("O plano A é a melhor opção.");
             }
         }
}
}

    
    

