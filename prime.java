public class prime
{
 public static void main(String[] args)
{
 int n,i;
  n=100;
  i=2;
 while(i<=n)
{
 if(n%i==0)
{
 break;
 
}
i++;
 if(n==i)
{
 System.out.print("n is prime "+n);
}
else
{
 System.out.print("n is not prime"+n);
}}
}
}