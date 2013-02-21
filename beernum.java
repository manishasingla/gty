public class beersong
{
 	public static void main(String[] args)
{
 	int beernum=99;
 	string word="bottles";
 	while(beernum>0) 
	{
		if(beernum==1)
		{
			word="bottle";
		}
		System.out.println(beernum + " " + word + " of beer on the wall");
		System.out.println(beernum + " " + word + " of beer.");
		System.out.println("take one down.");
		System.out.println("pass it around.");
                beernum=beernum-1;
		if(beernum>0) 
                {
			System.out.println(beernum + " " + word + " of beer on the wall");
		}
		else
		{
			System.out.println("no more bottles of beer on yhe wall");
		}
	}

   }
} 
 