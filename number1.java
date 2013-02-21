class number
{
	boolean primenumber(int a)
	{ 
    		for(int i=2;i<a/2;i++) 
     		{
       			if(a%i==0)
      			{
        		return false;
       			}
       		}
        		 return true;
        }
        
     
           boolean iseven(int n)
          {
            if(n%2==0)
            {
               return true;	
             }
              else
		{
                  return false;
}
              }  
			}
public class number1
{
 public static void main(String[] args)
{
 number n=new number();
if(n.primenumber(5)==true)
{ 
System.out.println("no is prime");
}
else
{
 System.out.print("no is not prime");
}

System.out.print(n.iseven(6));
}        
 }   
