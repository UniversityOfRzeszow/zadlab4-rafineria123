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
public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void pole(){
    System.out.println("Pole wynosi: "+(this.a*this.b));
    }
    public void obwod(){
    System.out.println("Obwod wynosi: "+(this.a*2+this.b*2));
    }
}
