/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author rafineria123
 */
public class Kalkulator {
    public static void main(String[] args) {
        while(true){
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            Scanner wczytanie=new Scanner(System.in);
            System.out.println("Kalkulator");
            System.out.println("1. Kolo");
            System.out.println("2. Stożek");
            System.out.println("3. Szescian");
            System.out.println("4. Prostopadloscian");
            System.out.println("5. Prostokąt");
            System.out.println("6. Kula");
            System.out.println("7. Kwadrat");
            System.out.println("8. Zakoncz program");
            
            int wybor=wczytanie.nextInt();
            double a,b,c,r,h,l;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            switch(wybor){
                case 1:
                    System.out.println("Podaj promien: ");
                    r=wczytanie.nextDouble();
                    Circle kolo=new Circle(r);
                    kolo.obwod();
                    kolo.pole();
                    break;
                case 2:
                    System.out.println("Podaj wysokosc: ");
                    h=wczytanie.nextDouble();
                    System.out.println("Podaj tworzaca: ");
                    l=wczytanie.nextDouble();
                    System.out.println("Podaj promien: ");
                    r=wczytanie.nextDouble();
                    Cone stozek=new Cone(r,h,l);
                    stozek.objetosc();
                    stozek.pole();
                    break;
                case 3:
                    System.out.println("Podaj bok: ");
                    a=wczytanie.nextDouble();
                    Cube szescian=new Cube(a);
                    szescian.objetosc();
                    szescian.pole();
                    break;
                case 4:
                    System.out.println("Podaj bok a: ");
                    a=wczytanie.nextDouble();
                    System.out.println("Podaj bok b: ");
                    b=wczytanie.nextDouble();
                    System.out.println("Podaj bok c: ");
                    c=wczytanie.nextDouble();
                    Cuboid prostopadloscian=new Cuboid(a,b,c);
                    prostopadloscian.objetosc();
                    prostopadloscian.pole();
                    break;
                case 5:
                    System.out.println("Podaj bok a: ");
                    a=wczytanie.nextDouble();
                    System.out.println("Podaj bok b: ");
                    b=wczytanie.nextDouble();
                    Rectangle prostokat=new Rectangle(a,b);
                    prostokat.obwod();
                    prostokat.pole();
                    break;
                case 6:
                    System.out.println("Podaj promien: ");
                    r=wczytanie.nextDouble();
                    Sphere kula=new Sphere(r);
                    kula.pole();
                    kula.objetosc();
                    break;
                case 7:
                    System.out.println("Podaj bok: ");
                    a=wczytanie.nextDouble();
                    Square kwadrat=new Square(a);
                    kwadrat.pole();
                    kwadrat.obwod();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Liczba nie jest z zakresu liczb calkowitych <1:7>");
                    break;
                    
                
            }
            
        try {
            Thread.sleep(2500);

        } 
        catch (InterruptedException e) {

        }
        }
        

    }
    
    
}
