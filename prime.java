import java.util.*;
public class prime{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
Boolean isPrime=true;
for(int i=2;i<=Math.sqrt(num);i++)
{
if(num %i==0)
{

isPrime=false;
break;
}

}


System.out.println(isPrime);



}

}
