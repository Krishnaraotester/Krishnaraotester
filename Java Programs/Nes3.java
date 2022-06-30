class Nes3
  {
	public static void main(String args[])
	{
	   int a=5;
	   int b=25;
	   int n;
   		for(n=a; n<=b; n++)
     	{
     		int c=0; 
   			for(int f=1; f<=n;f++)
   			{
   
 				if(n%f==0)

 				{
 					c=c+1;

 				}

   			}
  		 if(c==2)
   		{

		System.out.println(n);
   		 }

  	 }
}
}
   
