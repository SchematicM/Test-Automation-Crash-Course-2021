public class Number_TASK {
    static char[] reverse(char a[])
    {
        char[] b = new char[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j--;
        }

        return b;
    }

    static char[] swapFIRST_and_Last(char a[])
    {
        char[] b = new char[a.length];
        for (int i = 0;i<a.length;i++)
        {
            b[i] = a[i];
        }
        b[0]=a[a.length-1];
        b[a.length-1] = a[0];

        return b;
    }
    static char[] add_one(char a[])
    {
        char[] b = new char[a.length+2];
        b[0]='1';
        for (int i = 1;i<a.length+1;i++)
        {
            b[i] = a[i-1];
        }

        b[a.length+1] = '1';

        return b;
    }
    public static void main(String[] args) {

        int a = 123467;
        System.out.println("A = " + a);
        char [] charArray_a = Integer.toString(a).toCharArray();
// TASK1
        System.out.println("TASK 1: Is number 3 in squared number?");
        int a2 = (int)Math.pow(a,2);
        System.out.println("A*A = " + a2);

        char [] charArray = Integer.toString(a2).toCharArray();

        int count =0;
        for (int i = 0;i<charArray.length; i++){
            int c = Character.getNumericValue(charArray[i]);
            if (c == 3)
            {
                count ++;
            }
            else
            {
                continue;

            }
        }
        if (count > 0)
        {
            System.out.println("Your squared number contains 3!");
        }
        else
        {
            System.out.println("Your squared number does not contain 3!");
        }

        //TASK2
        System.out.println("TASK 2: Reverse number.");

        char [] rev = Number_TASK.reverse(charArray_a);

        String rev_str= new String();
        for (char el: rev)
        {
            rev_str += el;
        }
        int reversed = Integer.parseInt(rev_str);
        System.out.println(reversed);

        //TASK3
        System.out.println("TASK 3: Change first and last digit in number.");

        char [] swap = Number_TASK.swapFIRST_and_Last(charArray_a);

        String swap_str= new String();
        for (char el: swap)
        {
            swap_str += el;
        }
        int swapped = Integer.parseInt(swap_str);
        System.out.println(swapped);

        //TASK4
        System.out.println("TASK 4: Add '1' on begining and end of number.");

        char [] add = Number_TASK.add_one(charArray_a);


        String add_str= new String();
        for (char el: add)
        {
            add_str += el;
        }
        int added = Integer.parseInt(add_str);
        System.out.println(added);

    }




}