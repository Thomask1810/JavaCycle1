import java.util.Scanner;
class _8factorial
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num,i,f,j;
    System.out.println("Enter limit to find factorial");
    num=sc.nextInt();
    System.out.println("Factorial of numbers");
    if(num>0)
    System.out.println("0!=1");
    for(i=1;i<num;i++)
    {
      f=1;
      for(j=1;j<=i;j++)
      {
        f=f*j;
      }
      System.out.println(i+"!="+f);
    }
    }
  }
