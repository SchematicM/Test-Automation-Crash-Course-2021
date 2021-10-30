import com.sun.jdi.InvalidTypeException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static  BufferedReader reader = new BufferedReader(
          new InputStreamReader(System.in));
    public static double div(double a, double b) {
        try {
            if (b == 0.0) throw new ArithmeticException("Cannot divide by zero!");
             return a / b;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            return -1;
        }
    }

    public static int  readNumber(int start, int end) throws IOException {
        String a = reader.readLine();
        int b = 0;
        try {
            b = Integer.parseInt(a);
            if (b < start || b > end)
                throw new NotInRangeException();
        } catch (NumberFormatException e)
        {
            System.err.println("You must enter a number: ");
            b = readNumber(start, end);
        } catch (NotInRangeException e)
        {
            System.err.printf("You must enter a number in range %d and %d\nTry again: ", start, end);
            b = readNumber(start, end);
        }
        return b;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(div(3, 2));
        System.out.println(div(5, 0));

        int[] numbers = new int[10];
        int previous = 1;
        for (int i = 0; i < 10; i++) {
            int n = readNumber(10, 50);
            while (n <= previous) {
                System.out.println("Previous number was higher, try again: ");
                n = readNumber(10, 50);
            }
            previous = n;
            numbers[i] = n;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

class NotInRangeException extends Exception {}