class array2d1
{
	public static void main(String args[])
	{
	int[][] x={{10,20},{30,40}};
	int[][] y={{4,7},{9,5}};
	int[][] z={{0,0},{0,0}};
	System.out.println("x elements");
	for(int i=0; i<x.length;i++)
	{
	for(int j=0; j<=2; j++)
	{
	System.out.print(x[i][j]+ " ");
	}
	System.out.println();
	}
	System.out.println("sum of x any y element");
	for(int i=0; i<=2; i++)
	{
	for(int j=0; j<=2;j++)
	{
	z[i][j]=x[i][j]+y[i][j];
	System.out.print(z[i][j]+" ");
	}
	System.out.println();

	}
	}
	}
