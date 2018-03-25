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
public class Cone {
    double r;
    double h;
    double l;

    public Cone(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }
    public void pole(){
    System.out.println("Pole wynosi: "+(Math.PI*this.r*(this.r+this.l)));
    }
    public void objetosc(){
    System.out.println("Objetosc wynosi: "+(1/3*Math.PI*Math.pow(this.r, 2)*this.h));
    }
}
