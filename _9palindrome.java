import java.util.Scanner;
class _9palindrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num,d,r=0,num1;
    System.out.println("Enter number to be checked");
    num=sc.nextInt();
    num1=num;
    while(num>0)
    {
      d=num%10;
      r=r*10+d;
      num=num/10;
    }
    if(r==num1)
    System.out.println("Number is palindrome");
    else
    System.out.println("Number is not palindrome");
  }
}
