
package Examen;

//@author BETTERLEE

import java.util.Scanner;


public class ReproductorM {
Scanner r = new Scanner(System.in);
    int opcion;
    
    public void Menu(){
        while(opcion<=5){
            System.out.println("\n--------------------- Reproductor de musica --------------------");
             System.out.println("\nElige el genero que deseas escuchar\n " + 
                     "\n1-Kpop" + "\n2-Pop" + "\n3-PopRock" + "\n4-Heavy Metal");
             opcion= r.nextInt();
             
             switch(opcion){
                 case 1:
                     kpop  c = new kpop();
                     c.padre();
                     break;
                 case 2:
                     Pop p = new Pop();
                     p.padre();
                     p.padre();
                     break;
                 case 3:
                     PopRock pr = new PopRock();
                     pr.padre();
                    
                     break;
                 case 4:
                     Heavy_Metal hm = new Heavy_Metal();
                     hm.padre();
                     break;
             }
        }
    }
    public static void main(String[] args) {
       ReproductorM imprimir = new ReproductorM();
        imprimir.Menu();
    }
    
}
