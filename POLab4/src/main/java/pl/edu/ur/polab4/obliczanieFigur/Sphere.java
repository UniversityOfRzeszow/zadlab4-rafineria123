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
public class Sphere {
    double r;

    public Sphere(double r) {
        this.r = r;
    }
    public void pole(){
    System.out.println("Pole wynosi: "+(4*Math.PI*Math.pow(this.r, 2)));
    }
    public void objetosc(){
    System.out.println("Objetosc wynosi: "+(4/3*Math.PI*Math.pow(this.r, 3)));
    }
    
}
