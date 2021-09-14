
package Programacion1;

import java.util.Scanner;

/**
 *
 * @author Pc-Gamer XD
 */
public class Promedio {
    
    Scanner leer  = new Scanner(System.in);
    double not1,not2,not3,not4,not5,Resultado,Sumatoria;
    
    
    public void inicio(){
        System.out.print("Igrese Nota 1: ");
        not1 = leer.nextDouble();
        System.out.print("Igrese Nota 2: ");
        not2 = leer.nextDouble();
        System.out.print("Igrese Nota 3: ");
        not3 = leer.nextDouble();
        System.out.print("Igrese Nota 4: ");
        not4 = leer.nextDouble();
        System.out.print("Igrese Nota 5: ");
        not5 = leer.nextDouble();        
    }
    
    public void calcular(){
        Sumatoria = not1+not2+not3+not4+not5;
        Resultado = Sumatoria/5;
        
    }
    public void imprimir(){
        System.out.println("El promedio Es: " + Resultado);
    }
    
}
