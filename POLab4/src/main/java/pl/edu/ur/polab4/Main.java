package pl.edu.ur.polab4;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
      Student s1=new Student("Rafal");
      s1.wyswietl();
      Student s2=new Student("Rafal","Sudol");
      s2.wyswietl();
      Student s3=new Student(2223,"Programowanie");
      s3.wyswietl();
      Student s4=new Student("rafal",2017);
      s4.wyswietl();
    }
    
}
