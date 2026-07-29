import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
    float area,pi;
    int r;
    pi=3.14f;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of radius: ");
    r=sc.nextInt();
    area=pi*r*r;
    System.out.print("Area of circle : "+area);
    }
}