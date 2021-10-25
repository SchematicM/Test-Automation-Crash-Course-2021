import java.time.Year;
import java.util.Scanner;

public class hometask3 {
    static Scanner in = new Scanner(System.in);

    public static double Perimetr(double r) {
        return 2*Math.PI*r;
    }
    public static double Area(double r) {
        return Math.PI*Math.pow(r,2) ;
    }

    public static void main(String[] args) {
        //Task 1
        System.out.print( "Enter the radius, please:  ");
        double r = in.nextDouble();
        System.out.println("Perimetr :  " + Perimetr(r));
        System.out.println("Area :  " + Area(r));

        //Task 2
        System.out.print( "What is your name?  ");
        String  name = in.next();
        System.out.print( "Where do you live,  "+ name + "? ");
        String  adress = in.next();
        System.out.println("Your name is "+ name +" and your native adress is " + adress);


    }
}
