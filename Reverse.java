import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a 6 digit number: ");
    a=sc.nextInt();
    System.out.print(a%10);
    a=a/10;
    System.out.print(a%10);
    a=a/10;
    System.out.print(a%10);
    a=a/10;
    System.out.print(a%10);
    a=a/10;
    System.out.print(a%10);
    a=a/10;
    System.out.print(a%10);
    }
}