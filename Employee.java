import java.util.*;
class employee
{
    int i;
    String n;
    long m;
    employee(int id,String name,long mob)
    {  
        i=id;
        n=name;
        m=mob;
     }
void display()
{
   System.out.println("id:"+i);
   System.out.println("name:"+n);
   System.out.println("mobile number:"+m);
}
public static void main(String[] args)
{
 	Scanner in=new Scanner(System.in);
	System.out.println("Enter the name:");
	String name=in.nextLine();
	System.out.println("enter the id:");
	int id=in.nextInt();
	System.out.println("Enter the mobile number:");
	long mob=in.nextLong();
	employee emp=new employee(id,name,mob);
	emp.display();
}
}
