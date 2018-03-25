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
public class Cuboid {
    double a;
    double b;
    double c;

    public Cuboid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void pole(){
    System.out.println("Pole wynosi: "+(2*this.a*this.b+2*this.a*this.c+2*this.b*this.c));
    }
    public void objetosc(){
    System.out.println("Objetosc wynosi: "+(this.a*this.b*this.c));
    }
}
