import java.util.Scanner;
class _6factors
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num,i;
    System.out.println("Enter number to find factors");
    num=sc.nextInt();
    System.out.println("Factors are:");
    for(i=1;i<=num;i++)
    {
      if(num%i==0)
      System.out.print(i+",");
    }
  }
}
