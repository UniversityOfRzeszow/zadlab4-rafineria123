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
public class Cube {
    double a;

    public Cube(double a) {
        this.a = a;
    }
    public void pole(){
    System.out.println("Pole wynosi: "+(Math.pow(this.a, 2)*6));
    }
    public void objetosc(){
    System.out.println("Objetosc wynosi: "+(Math.pow(this.a,3)));
    }
}
