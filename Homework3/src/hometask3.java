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

        //Task 3
        double c1=7.9;
        double c2=6;
        double c3=13.5;

        int t1 = 23;
        int t2 = 93;
        int t3 = 100;

        System.out.println("c1*t1 = " + c1*t1);
        System.out.println("c2*t2 = " + c2*t2);
        System.out.println("c3*t3 = " + c3*t3);

        System.out.println("Sum = " + c1*t1+c2*t2+c3*t3);








    }
}
