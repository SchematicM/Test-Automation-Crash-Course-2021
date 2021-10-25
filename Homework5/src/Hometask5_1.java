import task5.HTTPError;

import java.util.Scanner;

public class Hometask5_1 {
    static Scanner in = new Scanner(System.in);

    public static boolean isInInterval(double number, double left, double right) {
        return number >= left && number <= right;
    }
    public static void main(String[] args) {
        // Task 1
//        System.out.print("Write, please 3 numbers to check are they all  from interval [-5;5]:  ");
//
//        double number1 = in.nextDouble();
//        double number2 = in.nextDouble();
//        double number3 = in.nextDouble();
//
//        if (isInInterval(number1, -5, 5) &&
//                isInInterval(number2, -5, 5) &&
//                isInInterval(number3, -5, 5))
//            System.out.println("All Belongs");
//        else
//            System.out.println("Not All belongs");
//
//        // Task 2
//        System.out.print("Write, please 3 numbers to find the biggest one:  ");
//
//        int n1 = in.nextInt();
//        int n2 = in.nextInt();
//        int n3 = in.nextInt();
//
//        System.out.println("Maximum of 3 numbers: " + Math.max(n1, Math.max(n2, n3)));

        // Task 3 - HTTP Errors
        System.out.print("Write, please the code of mistake:  ");
        int errorCode = in.nextInt();
        HTTPError httpError;
        switch(errorCode) {
            case 400: httpError = HTTPError.BAD_REQUEST;break;
            case 401: httpError = HTTPError.UNAUTHORIZED;break;
            case 402: httpError = HTTPError.PAYMENT_REQUIRED;break;
            case 403: httpError = HTTPError.FORBIDDEN;break;
            case 404: httpError = HTTPError.NOT_FOUND;break;
            default: httpError = HTTPError.UNKNOWN;
        }
        System.out.println(httpError.getErrorMessage());
    }
}
