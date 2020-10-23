import java.util.Scanner;
class _5sum
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,i,sum=0;
    System.out.println("Enter limit to find sum");
    a=sc.nextInt();
    for(i=1;i<=a;i++)
    {
      sum=sum+i;
    }
    System.out.println("Sum="+sum);
  }
}
