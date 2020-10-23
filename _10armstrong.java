import java.util.Scanner;
class _10armstrong
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num,num1,num2;
    int c=0,f,i,s=0,d;
    System.out.println("Enter number to be checked");
    num=sc.nextInt();
    num1=num2=num;
    while(num>0)
    {
      c=c+1;
      num=num/10;
    }
    while(num1>0)
    {
      d=num1%10;
      f=1;
      for(i=1;i<=c;i++)
        f=f*d;
      s=s+f;
      num1=num1/10;
    }
    if(s==num2)
    System.out.println("Number is Armstrong");
    else
    System.out.println("Number is not Armstrong");
  }
}
