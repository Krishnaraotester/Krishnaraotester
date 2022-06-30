class Hcf
{
public static void main(String args[]) 
	{
   int x;
	int y;
	x =12;
	y =4;
	int hcf;
	hcf=x<y? x:y;
	while(hcf>1)
	{
		if((x%hcf==0)&&(y%hcf==0))
	{
     break;
		}
		hcf=hcf=1;
	}
	System.out.println("Hcf "+hcf);

	}
}