import java.util.*;
public  class SumOddE
{
   public static void main(String[] args)
{
    System.out.println("Enter the number");
  int n,sumE=0,sumO=0;
   Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
   int []a =new int[n];
   System.out.println("Enter the element of array");

   for(int i=0;i<n;i++)

  {
    a[i]=sc.nextInt();
   }
  for(int i =0; i <n;i++)
    {
      if(a[i] %2==0)
        { 
              sumE=sumE+a[i];
        }
          
    else  
         {
          sumO=sumO+a[i];

        }
}
System.out.println(+sumE);
  System.out.println(+sumO);

     
    }
   }



