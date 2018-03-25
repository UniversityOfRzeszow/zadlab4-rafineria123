package pl.edu.ur.polab4;
import pl.edu.ur.polab4.obliczanieFigur.*;
import pl.edu.ur.polab4.wprowadzDane.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentManager x=new StudentManager();
        x.wypelnienie();
        x.zmiana();
        x.wyswietlenie();
        x.usuniecie();
        x.wyswietlenie();
        x.wyswietleniezakres();
        x.wyswietleniewszystkich();
    }
    
}
