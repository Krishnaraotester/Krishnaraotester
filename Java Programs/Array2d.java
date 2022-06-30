class Array2d
  {
public static void main(String args[])
    {
	int[][] x={{10,20,},{30,40,},{1,2},{3,4}};
	for(int i=0;i<x.length;i++)
	{
	for(int j=0; j<2; j++)
		
	{
	System.out.println("Element at "+"row"+i+"column"+j+" is " +x[i][j]+ " ");
	}
	System.out.println();
	}
	System.out.println("2d Array stores data like matrix ");
	for(int i=0; i< x.length;i++)
	{
	for(int j=0; j<2;j++)
	{
	System.out.print(x[i][j]+ " ");
	}
	System.out.println();

	}
    
     }
	
	}
	