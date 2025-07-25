import java.util.*;
public class factorial1
{
public int fact(int n)
 {
   int total=1;
if(n>=1)
   total=n* fact(n-1);
return total;
}
public static void main(String args[])
      {
           int num;
   System.out.println("Enter the number");
  Scanner sc=new Scanner(System.in);
  num=sc.nextInt();
 factorial1 f = new factorial1();
  System.out.println("factorial is"+f.fact(num));

      }

 }

