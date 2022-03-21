import java.util.*;
class Calculator 
   {
   public static void main(String[] args) 
      {
      Scanner s1 = new Scanner(System.in);
    float ans,num1,num2;
    int choice;
      System.out.println("Enter two numbers: ");
      num1 = s1.nextFloat();
      num2 = s1.nextFloat();
      System.out.println("\nEnter your choice:");
      choice=s1.nextInt();
      switch(choice)
	 {
         case 1:
		ans=num1+num2;
		System.out.println("\nthe sum is:"+ans);
            	break;
         case 2:
	 	ans=num1-num2;  
		System.out.println("\nthe difference is:"+ans);
		break;
         case 3:
		 ans=num1*num2;
		 System.out.println("\n the product is:"+ans);
            	 break;
         case 4:
		 ans=num1/num2;
		 System.out.println("\n the quotient is:"+ans);
            	 break;
	default:
	System.out.println("wrong choice");
}
}
}
      