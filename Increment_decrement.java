import java.util.Scanner;
class Increment_decrement
{
    public static void main(String args[])
    {
        int a ,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A value: ");
        a=sc.nextInt();
        b=a++;
        System.out.println("After post increment the value of A:"+a);
        System.out.println("After post increment the value of B: "+b);
        b=++a;
        System.out.println("After pre increment the value of A: "+a);
        System.out.println("After pre increment the value of B: "+b);
        b=a--;
        System.out.println("After post decrement the value of A : "+a);
        System.out.println("After post decement the value of b: "+b);
        b=--b;
        System.out.println("After pre decrement the value of A: "+a);
        System.out.println("After pre decrement the value of B: "+b);
    }
}