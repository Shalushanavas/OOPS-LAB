import java.util.*;
class array
{
	public static void main(String[]args)
	{
	Scanner s1=new Scanner(System.in);
	int a[][]=new int[3][4];
	int i,j;
	System.out.println("\nEnter the elements of array:");
	for(i=0;i<3;i++)
	{
	for(j=0;j<4;j++)
	{
	a[i][j]=s1.nextInt();
	}
	}
	System.out.println("\nArray elements are");
	for(i=0;i<3;i++)
	{
	for(j=0;j<4;j++)
	{
	System.out.println(a[i][j]);
	}
	System.out.println(" ");
	}
	}
	}
	