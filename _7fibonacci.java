import java.util.Scanner;
class _7fibonacci
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num,i;
    int t1=0,t2=1,t3;
    System.out.println("Enter number of terms of fibonacci series");
    num=sc.nextInt();
    System.out.print(t1+" "+t2);
    for(i=1;i<=num-2;i++)
    {
      t3=t1+t2;
      System.out.print(" "+t3);
      t1=t2;
      t2=t3;
    }
  }
}
