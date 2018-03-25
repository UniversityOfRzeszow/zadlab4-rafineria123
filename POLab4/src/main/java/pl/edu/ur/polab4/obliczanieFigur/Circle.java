/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author rafineria123
 */
public class Circle {
   double r;

    public Circle(double r) {
        this.r = r;
    }
   
   public void pole(){
       System.out.println("Pole wynosi: "+(Math.PI*Math.pow(this.r,2)));
   }
   public void obwod(){
       System.out.println("Obwod wynosi: "+(2*Math.PI*this.r));
   }
}
