import java.util.*;
class Array
	{
	public static void main(String[]args)
	{
	Scanner s1=new Scanner(System.in);
	int a[]=new int[5];
	int i;
	System.out.println("\nEnter the elements of array");
	for(i=0;i<5;i++)
	{
		a[i]=s1.nextInt();
	}
		System.out.println("The elements of array are:");
	for(i=0;i<5;i++)
	{
		System.out.println(a[i]);
}
}
}
	