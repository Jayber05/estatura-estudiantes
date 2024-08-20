/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estaturaestudiantes;

/**
 *
 * @author angel
 */
public class estatura {
     private double est[]= new double[25], menor, mayor;
     
     
      public estatura(double []est){
          this.est=est;
      }
      public void setEstMy(){
       mayor = (double) est[0];
        for (int i=0;i<est.length;i++){
            if(est[i]>mayor){
                mayor= (double) est[i];
            }
        }
    }
      public void setEstMn(){
       menor = (double) est[0];
        for (int i=0;i<est.length;i++){
            if(est[i]<menor){
                menor= (double) est[i];
            }
        }
    }
      public double getEstMy(){
          System.out.println("la estatura mas alta de la clase es: "+mayor);
          return mayor;
      }
       public double getEstMn(){
          System.out.println("la estatura mas baja de la clase es: "+menor);
          return menor;
       }
}
