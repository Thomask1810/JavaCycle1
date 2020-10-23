import java.util.Scanner;
class _4prime
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,i,count=0;
    System.out.println("Enter number to be checked");
    a=sc.nextInt();
    for(i=1;i<=a;i++)
    {
      if(a%i==0)
      count=count+1;
    }
    if(count==2)
    System.out.println("Number is prime");
    else
    System.out.println("Number is not prime");
  }
}
