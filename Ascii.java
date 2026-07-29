import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        ch=sc.next().charAt(0);
        int ascii=(int)ch;
        System.out.println("The ASCII value of "+ch+" is: "+ascii);
    }
}