// Task 1 : Can we pop a brick(a,b,c) into a hole(x,y)
public class Brick_TASK {

    public static void main(String[] args) {
        int a, b,c, x,y;
        a= 2;
        b=8;
        c=8;

        x= 7;
        y=7;

        if (   ((x>=a) && (y>=b))||((x>=b) && (y>=a))
                || ((x>=a) && (y>=c))||((y>=c) && (y>=a))
                || ((x>=c)&& (y>=b))||((x>=b) && (y>=c))   )
        {
            System.out.println("Ok!");
        }
        else
        {
            System.out.println("Not ok!");

        }

    }
}