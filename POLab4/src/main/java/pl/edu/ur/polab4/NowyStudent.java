/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class NowyStudent {
    
    public static void main(String[] args) {
        Scanner wczytanie=new Scanner(System.in);
        System.out.println("Podaj Imie");
        String imie=wczytanie.next();
        System.out.println("Podaj Nazwisko");
        String nazwisko=wczytanie.next();
        System.out.println("Podaj nr indeksu");
        int nr_indeks=wczytanie.nextInt();
        System.out.println("Podaj nazwe specjalnosci");
        String nazwa_specjalnosci=wczytanie.next();
        System.out.println("Podaj rok studiow");
        int rok_studiow=wczytanie.nextInt();
        Student  stud=new Student(imie,nazwisko,nr_indeks,nazwa_specjalnosci,rok_studiow);
        stud.wyswietl();
    }
    
}
