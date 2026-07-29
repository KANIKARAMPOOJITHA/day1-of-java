import java.util.Scanner;
class Swap_of_3num
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        System.out.println("Enter the value of c");
        c=sc.nextInt();
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("After swapping the value of a is:"+a);
        System.out.println("After swapping the value of b is:"+b);
        System.out.println("After swapping the value of c is:"+c);
    }
}   