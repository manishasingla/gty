public class pdrm
{
 public static void main(String[] args)
{
 int num=121;
 int temp=121;
 int rev=0;
 while(temp!=0)
{ 
 rev=rev*10+temp%10;
 temp=temp/10;
}
 if(num==rev)
{
 System.out.print("num is plandrome "+num);
}
else
{
 System.out.print("num is not  plandrome "+num);
}
}
}