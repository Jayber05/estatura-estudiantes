/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaturaestudiantes;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Estaturaestudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] estatura = new double[25];
         Scanner entrada= new Scanner(System.in);
        
        System.out.println("digita la estatura de los 25 estudiantes");
        for (int i = 0; i < 25; i++) {
        estatura[i]=entrada.nextDouble();
        
        }
        estatura y=new estatura(estatura);
        y.setEstMy();
        y.getEstMy();
        y.setEstMn();
        y.getEstMn();
    }
    
}
