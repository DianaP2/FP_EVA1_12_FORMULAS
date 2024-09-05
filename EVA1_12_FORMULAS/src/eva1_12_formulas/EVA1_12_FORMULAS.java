package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA1_12_FORMULAS {
    public static void main(String[] args) {
        double vel,tie,ace,dis;
        
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Calcula la distancia");
        
        System.out.println("ingresa la velocidad inicial");
        vel=captu.nextDouble();
        
        System.out.println("Ingresa tiempo");
        tie=captu.nextDouble();
        
        System.out.println("Ingresa aceleracion");
        ace=captu.nextDouble();
        
        dis = (vel * tie) + (ace * Math.pow(tie, 2) / 2.0); 
        
        System.out.println("La distancia es: " + dis);
        
        
    }
    
}
