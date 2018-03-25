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
public class Square {
    double a;

    public Square(double a) {
        this.a = a;
    }
    public void pole(){
    System.out.println("Pole wynosi: "+(Math.pow(this.a,2)));
    }
    public void obwod(){
    System.out.println("Obwod wynosi: "+(this.a*4));
    }
}
