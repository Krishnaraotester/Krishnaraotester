class Array3d
  {
public static void main(String args[])
    {
	int x[][] ={{10,20,},{30,40,}};
	int y[][] ={{5,10,},{20,10,}};
	int z[][] = new int [2][2]; // 2 rows and 2 columns
  
	for(int i=0;i<=2;i++)
	{
	for(int j=0; j<=2; j++)
	{
z[i][j]=x[i][j]+y[i][j];
	}
	System.out.println(z[i][j]+ " ");
	}
	System.out.println();

	     }
    
     }
	
	