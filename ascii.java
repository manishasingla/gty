public class ascii
{
 public static void main(String[] args)
{
 char c='A';
 
 if(c<='A' && c>='Z')
{
 c=(char)(c-32);
 System.out.print(c);
}
 else
{
 c=(char)(c+32);
 System.out.print(c);
}
}
}